import java.util.Date;

public class Account {
    private String number;
    private final Date creationDate;
    private double balance;

    public Account() {
        creationDate = new Date();
        balance = 0.0d;
    }

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
        creationDate = new Date();
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney(double amount){
        if ( amount <= balance ) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getNumber() {
        return this.number;
    }

    public String toString() {
        return "The balance of the account number ## " + this.number + " is $ " + this.balance;
    }
}