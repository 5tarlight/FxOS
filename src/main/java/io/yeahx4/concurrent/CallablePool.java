package io.yeahx4.concurrent;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class CallablePool {
    private static final ExecutorService service = Executors.newCachedThreadPool(
            new CallableTheadFactory()
    );

    public static <T> @NotNull Future<T> submit(@NotNull Callable<T> c) {
        return service.submit(c);
    }
}
