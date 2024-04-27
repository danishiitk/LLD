package strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paying using CreditCard");
    }
}
