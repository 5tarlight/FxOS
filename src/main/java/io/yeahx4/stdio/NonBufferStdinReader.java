package io.yeahx4.stdio;

import java.io.IOException;
import java.io.InputStream;

@Deprecated
public class NonBufferStdinReader {
    private final InputStream stdin = System.in;

    public int readKey() {
        try {
            return stdin.read();
        } catch (IOException ex) {
            StdoutWriter.getInstance().println(AnsiColor.RED + "Error : " + AnsiColor.RESET + ex.getMessage());
            return -1;
        }
    }
}
