package io.github.mall.admin.handler;


import io.github.bootmeta.result.R;
import io.github.bootmeta.result.Result;
import io.github.mall.admin.exception.BuzzException;
import io.github.mall.common.api.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;


/**
 * 统一异常处理器
 *
 * @author fengyupeng
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result nullPointer(NullPointerException ex) throws IOException {
        log.error("空指针异常", ex);
        return R.fail(500, ex.getMessage());
    }

    @ExceptionHandler(BadCredentialsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result badCredentials(BadCredentialsException ex) {
        log.error("认证异常", ex);
        return R.fail(505, ex.getMessage());
    }

    @ExceptionHandler(BuzzException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result buzzException(BuzzException ex) {
        log.error("业务异常", ex);
        return R.fail(506, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result except(Exception ex) throws IOException {
        log.error("未知异常", ex);
        return R.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Result throwable(Throwable ex) throws IOException {
        log.error("未知异常", ex);
        return R.fail(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMessage());
    }
}