package Strategy.Models;

public interface PaymentStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
