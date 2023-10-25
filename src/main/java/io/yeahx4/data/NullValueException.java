package io.yeahx4.data;

public class NullValueException extends RuntimeException {
    @Deprecated
    public NullValueException() {
        super("Value is null");
    }

    protected NullValueException(String reason) {
        super(reason);
    }
}
