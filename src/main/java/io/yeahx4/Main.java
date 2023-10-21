package io.yeahx4;

import io.yeahx4.event.CachedEventListener;
import io.yeahx4.stdio.StdoutWriter;

public final class Main {
    public static void main(String[] args) {
        StdoutWriter.getInstance().print("Hello ");
        StdoutWriter.getInstance().println("World!");
        StdoutWriter.getInstance().println("Welcome to FxOS.");

        shutdown();
    }

    public static void shutdown() {
        System.out.println("Gracefully shutting down...");
        CachedEventListener.shutdown();
    }

    public static void shutdownNow() {
        System.out.println("Forcibly shutting down...");
        System.out.println(CachedEventListener.shutdownNow().size() + " jobs not completed.");
    }
}
