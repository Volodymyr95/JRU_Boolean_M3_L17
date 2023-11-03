package ua.javarush.gof.mediator;

public interface Mediator {
    void send(String message, User user);
}
