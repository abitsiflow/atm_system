import java.util.Scanner;

public class Function {

    double balance = 0;

    public void showBalance(){
        System.out.println("$: " + balance);
    }

    public int deposit(Scanner scan){
        System.out.print("Enter a deposit: ");
        int amount = scan.nextInt();

        if(amount < 0){
            System.out.println("Deposit cannot be negative or less than 0");
            return 0;
        }else{
            System.out.println("Deposited succesfully!");

            return amount;
        }
    }

}
