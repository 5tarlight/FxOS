package io.yeahx4;

import io.yeahx4.stdio.AsyncStdoutWriter;

public final class Main {
    public static void main(String[] args) {
        AsyncStdoutWriter.getInstance().println("Hello World!");
        AsyncStdoutWriter.getInstance().join();
    }
}
