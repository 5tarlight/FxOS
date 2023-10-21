package io.yeahx4.event;

import lombok.NonNull;
import java.util.concurrent.ThreadFactory;

public class EventThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, "event-handler");
    }
}
