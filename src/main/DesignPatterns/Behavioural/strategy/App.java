package strategy;

public class App {
    //In this example:
    //- The `PaymentContext` class represents the context and contains a reference to the current payment strategy.
    //- The `PaymentStrategy` interface defines a method `pay` for performing payments.
    //- Concrete strategy classes (`CreditCardPaymentStrategy`, `PayPalPaymentStrategy`, `GooglePayPaymentStrategy`)
    // implement the `PaymentStrategy` interface and encapsulate the payment algorithms.
    //- In the client code, we create a `PaymentContext` object with an initial payment strategy and process
    // payments using different strategies by setting the payment strategy dynamically.
    public static void main(String[] args) {
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentContext paymentContext = new PaymentContext(creditCardPaymentStrategy);
        paymentContext.processPayment(1000);

        //Change the strategy at runtime
        PaymentStrategy paymentStrategy = new GooglePayPaymentStrategy();
        paymentContext.setPaymentStrategy(paymentStrategy);
        paymentContext.processPayment(2000);
    }
}
