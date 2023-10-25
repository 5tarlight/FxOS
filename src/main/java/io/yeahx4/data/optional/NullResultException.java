package io.yeahx4.data.optional;

import io.yeahx4.data.NullValueException;

public final class NullResultException extends NullValueException {
    public NullResultException() {
        super("Result is unwrapped but, it's value is null.");
    }
}
