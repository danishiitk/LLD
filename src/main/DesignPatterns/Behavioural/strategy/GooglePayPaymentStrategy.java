package strategy;

public class GooglePayPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying using GooglePay");
    }
}
