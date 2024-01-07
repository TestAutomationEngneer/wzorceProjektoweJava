package Strategy.strategies;

import Strategy.Models.CreditCard;
import Strategy.Models.PaymentStrategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CreditCardPayment implements PaymentStrategy {

    private CreditCard card;
    private BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Payment " + paymentAmount + " using Credit Card");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter card number");
            String number = READER.readLine();
            System.out.println("Enter card cvv");
            String cvv = READER.readLine();
            System.out.println("Enter card data expiry");
            String dataExpiry = READER.readLine();
            card = new CreditCard(number, cvv, dataExpiry);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
