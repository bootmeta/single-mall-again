package io.github.mall.admin.interceptor;

import io.github.bootmeta.result.R;
import io.github.mall.common.api.ResultCode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/**
 * HibernateValidator错误结果处理切面
 * Created on 2018/4/26.
 */
@Aspect
@Component
@Order(2)
public class BindingResultAspect {
    @Pointcut("execution(public * io.github.mall.admin.controller.*.*(..))")
    public void BindingResult() {
    }

    @Around("BindingResult()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof BindingResult) {
                BindingResult result = (BindingResult) arg;
                if (result.hasErrors()) {
                    FieldError fieldError = result.getFieldError();
                    if (fieldError != null) {
                        return R.fail(ResultCode.VALIDATE_FAILED.getCode(), fieldError.getDefaultMessage());
                    } else {
                        return R.fail(ResultCode.VALIDATE_FAILED.getCode(), ResultCode.VALIDATE_FAILED.getMessage());
                    }
                }
            }
        }
        return joinPoint.proceed();
    }
}
