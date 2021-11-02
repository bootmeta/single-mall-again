package io.github.mall.security.component;

import cn.hutool.json.JSONUtil;
import io.github.bootmeta.result.R;
import io.github.mall.common.api.Const;
import io.github.mall.common.api.ResultCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义返回结果：未登录或登录过期
 * Created on 2018/5/14.
 */
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding(Const.UTF8.getName());
        response.setContentType(Const.APP_JSON.getName());
        response.getWriter().println(JSONUtil.parse(R.fail(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage())));
        response.getWriter().flush();
    }
}
