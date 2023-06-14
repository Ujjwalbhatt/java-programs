import java.util.*;
public class Bank2{
    public static int deposit(int amount, int amt) {
        return amount += amt;
    }
    public static int withdraw(int amount, int amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
            return amount;
        } else {
            return amount -= amt;
        }
    }
    public static void displayBalance(int amount) {
        System.out.println("Amount: " + amount);
    }
    public static void display(String name, int acc_no, int amount) {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Amount: " + amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Account Number: ");
        int acc_no = sc.nextInt();
        System.out.println("Enter Amount: ");
        int amount = sc.nextInt();
        System.out.println("Enter Amount to be deposited: ");
        int amt = sc.nextInt();
        amount = deposit(amount, amt);
        displayBalance(amount);
        System.out.println("Enter Amount to be withdrawn: ");
        amt = sc.nextInt();
        amount = withdraw(amount, amt);
        displayBalance(amount);
        display(name, acc_no, amount);
    }
}
