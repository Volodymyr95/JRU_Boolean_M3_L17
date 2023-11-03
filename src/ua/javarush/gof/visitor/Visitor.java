package ua.javarush.gof.visitor;

public interface Visitor {
    void visit(TelegramSender telegramSender);
    void visit(EmailSender emailSender);
}
