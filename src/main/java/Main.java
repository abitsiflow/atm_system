import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Function func = new Function();

        System.out.println("------------");
        System.out.println("ATM MACHINE");
        System.out.println("------------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Show Balance");
        System.out.println("4. Exit");
        System.out.print("Enter Choice(1-4): ");
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                System.out.println("deposit");
                break;

            case 2:
                System.out.println("withdraw");
                break;

            case 3:
                func.showBalance();
                break;

            case 4:
                System.out.println("exit");
                break;
            default:
                System.out.println("Invalid choice you've choose please try again!");
                break;
        }

    }
}
