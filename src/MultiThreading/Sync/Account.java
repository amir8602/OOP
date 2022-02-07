package MultiThreading.Sync;
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount){
        this.balance+=amount;
    }
    public synchronized void withDraw(int amount){
        this.balance-=amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
