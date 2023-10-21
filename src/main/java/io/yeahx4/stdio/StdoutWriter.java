package io.yeahx4.stdio;

import io.yeahx4.event.CachedEventListener;

import java.io.PrintStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class StdoutWriter {
    private final BlockingQueue<StdoutObject> queue;
    private final PrintStream out;

    private StdoutWriter() {
        this.queue = new LinkedBlockingQueue<>();
        this.out = System.out;

        CachedEventListener.bind("stdout", payload -> {
            StdoutObject obj = queue.poll();
            if (obj == null)
                return;

            if (obj.type == LineType.NO_LINE)
                this.out.print(obj.value);
            else
                this.out.println(obj.value);
        });
    }

    private static class InstanceHolder {
        private static final StdoutWriter instance = new StdoutWriter();
    }

    private enum LineType {
        NO_LINE,
        NEW_LINE,
    }

    private record StdoutObject(String value, LineType type) {
    }

    public static StdoutWriter getInstance() {
        return InstanceHolder.instance;
    }

    public void println(String str) {
        StdoutObject obj = new StdoutObject(str, LineType.NEW_LINE);
        this.queue.add(obj);
        CachedEventListener.invoke("stdout", null);
    }

    public void print(String str) {
        StdoutObject obj = new StdoutObject(str, LineType.NO_LINE);
        this.queue.add(obj);
        CachedEventListener.invoke("stdout", null);
    }
}
