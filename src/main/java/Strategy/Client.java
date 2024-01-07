package Strategy;

import Strategy.Models.Order;
import Strategy.Models.PaymentStrategy;
import Strategy.strategies.CreditCardPayment;
import Strategy.strategies.PayPalPayment;

import javax.print.DocFlavor;
import javax.swing.border.Border;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Client {
    private static Map<Integer, Integer> priceOfProducts = new HashMap<>();
    private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PaymentStrategy strategy;

    static {
        priceOfProducts.put(1, 2200);
        priceOfProducts.put(2, 2400);
        priceOfProducts.put(3, 2600);
        priceOfProducts.put(4, 2800);
    }

    public static void main(String[] args) throws IOException {

        while (!order.isClosed()) {
            int cost;
            String continueSelecting;
            do {
                System.out.println(
                        """
                                Please select a product
                                1 - Mug
                                2 - Tshirt
                                3 - Mouse
                                4 - Keyboard
                                """
                );
                int choice = Integer.parseInt(READER.readLine());
                cost = priceOfProducts.get(choice);
                System.out.println("Quantity: ");
                int quantity = Integer.parseInt(READER.readLine());
                order.setTotalCosts(cost * quantity);
                System.out.println("Do you want to continue? Y/N");
                continueSelecting = READER.readLine();

            } while (continueSelecting.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println(
                        """
                                    Select payment method:
                                    1. PayPal
                                    2. Credit card
                                """);
                String paymentMethod = READER.readLine();
                strategy = (paymentMethod.equals("1")) ? new PayPalPayment() : new CreditCardPayment();

            }

            order.processOrder(strategy);
            System.out.println("Pay " + order.getTotalCosts() + " or continue shoping P/C");
            String proceed = READER.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCosts())) {
                    System.out.println("Payment has been done successfully");
                } else {
                    System.out.println("Payment FAILDE, please check data");
                }
                order.setClosed();
            }
        }
    }
}
