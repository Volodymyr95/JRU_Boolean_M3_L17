package ua.javarush.gof.visitor;

public class EmailSender implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void send() {
        System.out.println("via Email...");
    }
}
