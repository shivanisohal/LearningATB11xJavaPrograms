package Exception;

import java.util.Currency;

public class PracticeExampleCustomException {

    private String currency;
    private int Amount;

    public PracticeExampleCustomException(String currency, int Amount) {
        this.currency = currency;
        this.Amount = Amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public Integer add(PracticeExampleCustomException bankname) {
        if (bankname.currency.equals("INR")) {
            return bankname.Amount + this.Amount;
        } else {
            try {
                throw new customeException("Currency Mismatched");
            } catch (customeException c) {
                System.out.println(c.getMessage());
            }

        }

        return 0;
    }


    class customeException extends Exception {
        customeException(String msg) {
            super(msg);
        }
    }
}