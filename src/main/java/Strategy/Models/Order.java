package Strategy.Models;

public class Order {

    private int totalCosts = 0;

    private boolean isClosed = false;

    public void processOrder(PaymentStrategy paymentStrategy) {
        paymentStrategy.collectPaymentDetails();
    }

    public int getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(int totalCosts) {
        this.totalCosts = totalCosts;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
