package io.github.mall.admin.exception;

/**
 * 业务异常
 */
public class BuzzException extends RuntimeException {
    public BuzzException() {
        super();
    }

    public BuzzException(String message) {
        super(message);
    }

    public BuzzException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuzzException(Throwable cause) {
        super(cause);
    }

    protected BuzzException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static <T> T check(T reference, Object errorMessage) {
        if (reference != null) {
            throw new BuzzException(String.valueOf(errorMessage));
        } else {
            return reference;
        }
    }
}
