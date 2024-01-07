package Strategy.Models;

public class CreditCard {
    private int amount;
    private String number;
    private String cvv;
    private String date;

    public CreditCard(String number, String cvv, String date) {
        this.amount = 100000;
        this.number = number;
        this.cvv = cvv;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
