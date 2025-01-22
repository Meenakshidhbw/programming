import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
import java.util.ArrayList;

public class FinancialTransactionTracker { 

    // List to store transactions
    private static ArrayList<String> transactions = new ArrayList<>(); 

    public static void main(String[] args) {
        // Add sample transactions
        addTransaction("Purchase", 50.00, "2025-01-15");
        addTransaction("Sale", 150.00, "2025-01-16");
        addTransaction("Purchase", 30.00, "2025-01-16");
        addTransaction("Sale", 200.00, LocalDate.now().toString()); // Today's date transaction 

        // Display all transactions
        System.out.println("All Transactions:");
        displayTransactions();

        // Count transactions performed yesterday
        int yesterdayTransactions = countTransactionsYesterday();
        System.out.println("\nTransactions performed yesterday: " + yesterdayTransactions);

        // Calculate total income (Sales) and total expenses (Purchases)
        double totalIncome = calculateTotal("Sale");
        double totalExpenses = calculateTotal("Purchase");

        System.out.println("\nTotal Income (Sales): " + totalIncome);
        System.out.println("Total Expenses (Purchases): " + totalExpenses);
    }

    // Add a new transaction
    public static void addTransaction(String type, double amount, String date) {
        transactions.add(type + "," + amount + "," + date); 
    }

    // Display all transactions
    public static void displayTransactions() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Count transactions performed yesterday 
    public static int countTransactionsYesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1); // Get yesterday's date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String yesterdayString = yesterday.format(formatter);

        int count = 0;
        for (String transaction : transactions) {
            String[] parts = transaction.split(",");
            String date = parts[2];
            if (date.equals(yesterdayString)) {
                count++;
            }
        }
        return count;
    }

    // Calculate total income or expenses based on type ("Sale" or "Purchase")
    public static double calculateTotal(String type) {
        double total = 0.0;
        for (String transaction : transactions) {
            String[] parts = transaction.split(",");
            String transactionType = parts[0];
            double amount = Double.parseDouble(parts[1]);
            if (transactionType.equalsIgnoreCase(type)) {
                total += amount;
            }
        }
        return total;
    }
}



