package io.yeahx4.event;

public class InvalidEventNameException extends RuntimeException {
    public InvalidEventNameException(String name) {
        super("Event " + name + " is not exists.");
    }
}
