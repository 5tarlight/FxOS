package io.yeahx4.event;

import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public final class CachedEventListener implements EventListener {
    private static final ExecutorService executor = Executors.newCachedThreadPool(
            new EventThreadFactory()
    );
    private static final Map<String, Consumer<EventPayload>> eventMap = new HashMap<>();

    public static void bind(String name, Consumer<EventPayload> handler) {
        eventMap.put(name, handler);
    }

    public static void invoke(String name, EventPayload payload) throws InvalidEventNameException {
        executor.execute(() -> {
            if (!eventMap.containsKey(name)) {
                throw new InvalidEventNameException(name);
            }

            eventMap.get(name).accept(payload);
        });
    }
}
