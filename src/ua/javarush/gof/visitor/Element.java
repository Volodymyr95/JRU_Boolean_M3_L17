package ua.javarush.gof.visitor;

public interface Element {
    void accept(Visitor visitor);
}
