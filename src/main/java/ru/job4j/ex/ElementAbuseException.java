package ru.job4j.ex;

public class ElementAbuseException extends ElementNotFoundException {
    ElementAbuseException(String message) {
        super(message);
    }
}
