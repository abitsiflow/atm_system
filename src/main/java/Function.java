    import java.util.Scanner;
    import java.util.ArrayList;

    public class Function {


        Transaction transaction;
        ArrayList<Transaction> transactionHistory = new ArrayList<>();

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
                System.out.println("Deposited successfully!");
                balance += amount;
                transaction = new Transaction("deposit", amount);
                transactionHistory.add(transaction);
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
                System.out.println("Withdraw successfully!");
                balance -= amount;
                transaction = new Transaction("withdraw", amount);
                transactionHistory.add(transaction);
                return amount;
            }
        }

        void history(){

            for(Transaction transac : transactionHistory){
                if(transac == null){
                    System.out.println("No transaction has been registered");
                    return;
                }

                System.out.println(transac);
            }
        }
    }
