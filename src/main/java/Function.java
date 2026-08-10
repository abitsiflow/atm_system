import java.util.Scanner;
import java.util.ArrayList;

public class Function {

    private double balance = 0;

    public void showBalance(){
        System.out.println("$: " + balance);
    }

    public double deposit(Scanner scan){
        System.out.print("Enter a deposit: ");
        int amount = scan.nextInt();

        if(amount < 0){
            System.out.println("Deposit cannot be negative or less than 0");
            return 0;
        }else{
            System.out.println("Deposited succesfully!");
            balance += amount;
            return amount;
        }

    }

    public double withdraw(Scanner scan){
        System.out.print("Enter a Withdraw: ");
        int amount = scan.nextInt();

        if(amount < 0){
            System.out.println("Withdraw cannot be negative or less than 0");
            return 0;
        }else if(amount > balance){
            System.out.println("insufficient funds");
            return 0;
        }else {
            System.out.println("Withdraw succefully!");
            balance -= amount;
            return amount;
        }
    }
}
