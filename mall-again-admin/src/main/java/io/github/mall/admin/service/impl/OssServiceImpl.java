package io.github.mall.admin.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONUtil;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import io.github.mall.admin.dto.OssCallbackParam;
import io.github.mall.admin.dto.OssPolicyParam;
import io.github.mall.admin.service.OssService;
import io.github.mall.common.api.Const;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * oss上传管理Service实现类
 * Created on 2018/5/17.
 */
@Slf4j
@Service
public class OssServiceImpl implements OssService {

	@Value("${aliyun.oss.policy.expire}")
	private int ALIYUN_OSS_EXPIRE;
	@Value("${aliyun.oss.maxSize}")
	private int ALIYUN_OSS_MAX_SIZE;
	@Value("${aliyun.oss.callback}")
	private String ALIYUN_OSS_CALLBACK;
	@Value("${aliyun.oss.bucketName}")
	private String ALIYUN_OSS_BUCKET_NAME;
	@Value("${aliyun.oss.endpoint}")
	private String ALIYUN_OSS_ENDPOINT;
	@Value("${aliyun.oss.dir.prefix}")
	private String ALIYUN_OSS_DIR_PREFIX;

	@Autowired
	private OSSClient ossClient;

	/**
	 * 签名生成
	 */
	@Override
	public OssPolicyParam policy() {
		OssPolicyParam result = new OssPolicyParam();
		// 存储目录
		String dir = ALIYUN_OSS_DIR_PREFIX+ DateUtil.format(new Date(),"yyyyMMdd");
		// 签名有效期
		long expireEndTime = System.currentTimeMillis() + ALIYUN_OSS_EXPIRE * 1000;
		Date expiration = new Date(expireEndTime);
		// 文件大小
		long maxSize = ALIYUN_OSS_MAX_SIZE * 1024 * 1024;
		// 回调
		OssCallbackParam callback = new OssCallbackParam();
		callback.setCallbackUrl(ALIYUN_OSS_CALLBACK);
		callback.setCallbackBody("filename=${object}&size=${size}&mimeType=${mimeType}&height=${imageInfo.height}&width=${imageInfo.width}");
		callback.setCallbackBodyType("application/x-www-form-urlencoded");
		// 提交节点
		String action = "http://" + ALIYUN_OSS_BUCKET_NAME + "." + ALIYUN_OSS_ENDPOINT;
		try {
			PolicyConditions policyConds = new PolicyConditions();
			policyConds.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, 0, maxSize);
			policyConds.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, dir);
			String postPolicy = ossClient.generatePostPolicy(expiration, policyConds);
			byte[] binaryData = postPolicy.getBytes(Const.UTF8.getName());
			String policy = BinaryUtil.toBase64String(binaryData);
			String signature = ossClient.calculatePostSignature(postPolicy);
			String callbackData = BinaryUtil.toBase64String(JSONUtil.parse(callback).toString().getBytes("utf-8"));
			// 返回结果
			result.setAccessKeyId(ossClient.getCredentialsProvider().getCredentials().getAccessKeyId());
			result.setPolicy(policy);
			result.setSignature(signature);
			result.setDir(dir);
			result.setCallback(callbackData);
			result.setHost(action);
		} catch (Exception e) {
			log.error("签名生成失败", e);
		}
		return result;
	}

//	@Override
//	public OssCallbackResult callback(HttpServletRequest request) {
//		OssCallbackResult result= new OssCallbackResult();
//		String filename = request.getParameter("filename");
//		filename = "http://".concat(ALIYUN_OSS_BUCKET_NAME).concat(".").concat(ALIYUN_OSS_ENDPOINT).concat("/").concat(filename);
//		result.setFilename(filename);
//		result.setSize(request.getParameter("size"));
//		result.setMimeType(request.getParameter("mimeType"));
//		result.setWidth(request.getParameter("width"));
//		result.setHeight(request.getParameter("height"));
//		return result;
//	}

}
