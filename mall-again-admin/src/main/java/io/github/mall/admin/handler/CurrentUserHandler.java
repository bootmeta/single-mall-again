package io.github.mall.admin.handler;

import io.github.mall.admin.bo.AdminUserDetails;
import io.github.mall.common.anno.CurrentUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
public class CurrentUserHandler implements HandlerMethodArgumentResolver {

    private final static String Authorization = "Authorization";

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(CurrentUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        AdminUserDetails adminUserDetails = (AdminUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return adminUserDetails.getUsername();
    }
}
