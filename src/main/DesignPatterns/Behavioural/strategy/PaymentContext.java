package strategy;

public class PaymentContext {
    PaymentStrategy paymentStrategy;
    PaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(double amount){
        this.paymentStrategy.pay(amount);
    }
}
