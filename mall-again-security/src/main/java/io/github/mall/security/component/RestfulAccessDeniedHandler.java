package io.github.mall.security.component;

import cn.hutool.json.JSONUtil;
import io.github.bootmeta.result.R;
import io.github.mall.common.api.Const;
import io.github.mall.common.api.ResultCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义返回结果：没有权限访问时
 * Created on 2018/4/26.
 */
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException e) throws IOException, ServletException {
        response.setCharacterEncoding(Const.UTF8.getName());
        response.setContentType(Const.APP_JSON.getName());
        response.getWriter().println(JSONUtil.parse(R.fail(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage())));
        response.getWriter().flush();
    }
}
