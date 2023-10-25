package io.yeahx4.data.optional;

import io.yeahx4.data.function.Lambda;
import org.jetbrains.annotations.Nullable;
import java.util.function.Supplier;

public record Result<T>(@Nullable T value) {
    public T unwrap() {
        if (this.value == null)
            throw new NullResultException();
        return this.value;
    }

    public T unwrap(Supplier<T> or) {
        if (this.value == null)
            return or.get();
        else
            return this.value;
    }

    public @Nullable T unwrap(Lambda f) {
        if (this.value == null) {
            f.run();
            return null;
        } else
            return this.value;
    }

    boolean isNull() {
        return this.value == null;
    }
}
