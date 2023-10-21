package io.yeahx4.stdio;

import java.util.LinkedList;
import java.util.Queue;

@Deprecated(forRemoval = true)
public final class AsyncStdoutWriter {
    private final Queue<String> buffer;
    private final BufferWatcher watcher;

    private static class LazyHolder {
        private static final AsyncStdoutWriter instance = new AsyncStdoutWriter();
    }

    private class BufferWatcher extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    synchronized (buffer) {
                        if (buffer.isEmpty()) {
                            sleep(1);
                        } else {
                            String line = buffer.poll();
                            System.out.println(line);
                        }
                    }
                } catch (InterruptedException i) {
                    System.out.println("Gracefully shutting down stdout.");
                    break;
                }
            }
        }
    }

    private AsyncStdoutWriter() {
        this.buffer = new LinkedList<>();
        this.watcher = new BufferWatcher();
        this.watcher.setDaemon(true);
        this.watcher.setName("stdout-watcher");

        this.watcher.start();
    }

    public static AsyncStdoutWriter getInstance() {
        return LazyHolder.instance;
    }

    public synchronized void println(String line) {
        this.buffer.add(line);
    }

    public void join() {
        try {
            this.watcher.join();
        } catch (InterruptedException ignored) {}
    }
}
