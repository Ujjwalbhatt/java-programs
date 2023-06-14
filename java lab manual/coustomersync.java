class Customer {
    private int balance = 0;

    public synchronized void withdrawal(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); // Wait for deposit
            } catch (InterruptedException e) {
                  System.out.println(e);
            }
        }

        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        notify(); // Notify waiting thread (withdrawal) that deposit is done
    }
}
public class coustomersync {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Thread withdrawalThread = new Thread(() -> customer.withdrawal(500));
        Thread depositThread = new Thread(() -> customer.deposit(1000));

        withdrawalThread.start();
        depositThread.start();
    }
}



