package io.yeahx4.concurrent;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadFactory;

public class CallableTheadFactory implements ThreadFactory {
    @Override
    public Thread newThread(@NotNull Runnable r) {
        return new Thread(r, "worker-");
    }
}
