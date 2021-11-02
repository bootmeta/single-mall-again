package io.github.mall.admin.controller;


import io.github.bootmeta.result.R;
import io.github.bootmeta.result.Result;
import io.github.mall.admin.dto.OssPolicyParam;
import io.github.mall.admin.service.OssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@Api(tags = "OssController", description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {

    @Autowired
    OssService ossService;

    @ApiOperation(value = "oss上传签名生成")
    @RequestMapping(value = "/policy", method = RequestMethod.GET)
    @ResponseBody
    public Result policy() {
        OssPolicyParam policy = ossService.policy();
        return R.success(policy);
    }
}
