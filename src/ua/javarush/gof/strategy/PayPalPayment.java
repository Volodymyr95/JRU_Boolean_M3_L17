package ua.javarush.gof.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }


    @Override
    public void pay(int amount) {
        System.out.println(String.format("%d paid by paypal", amount));
    }
}
