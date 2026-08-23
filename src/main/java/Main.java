import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Function func = new Function();
        boolean mainIsRunning = true;

        while(mainIsRunning){
            System.out.println("------------");
            System.out.println("ATM MACHINE");
            System.out.println("------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Show Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter Choice(1-5): ");
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    func.deposit(scan);
                    break;

                case 2:
                    func.withdraw(scan);
                    break;

                case 3:
                    func.showBalance();
                    break;

                case 4:
                    func.history();
                    break;

                case 5:
                    mainIsRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice you've choose please try again!");
                    break;
            }

        }

        scan.close();


    }
}
