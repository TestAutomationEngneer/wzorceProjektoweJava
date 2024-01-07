package Strategy.strategies;

import Strategy.Models.PaymentStrategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayPalPayment implements PaymentStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static{
        DATA_BASE.put("dariusz@op.pl", "passwd1234");
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Payment " + paymentAmount + " using Paypal");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Enter your email");
                email = READER.readLine();
                System.out.println("Enter password");
                password = READER.readLine();
                if (verivy()) {
                    System.out.println("Data verification success");
                } else {
                    System.out.println("Wrong data");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    private boolean verivy() {
        setSignedIn(password.equals(DATA_BASE.get(email)));
        return signedIn;
    }
}
