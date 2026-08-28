import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    LocalDate date;
    String type;
    double amount;

    public Transaction(String type, double amount){
        this.date = LocalDate.now();
        this.type = type;
        this.amount = amount;
    }
}
