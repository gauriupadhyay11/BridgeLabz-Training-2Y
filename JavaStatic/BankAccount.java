package JavaStatic;
public class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final String accountNumber;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name       : " + bankName);
            System.out.println("Account Holder  : " + this.accountHolderName);
            System.out.println("Account Number  : " + this.accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", "SBI123456");
        BankAccount acc2 = new BankAccount("Bob", "SBI654321");

        System.out.println("=== Account 1 ===");
        acc1.displayAccountDetails();

        System.out.println("\n=== Account 2 ===");
        acc2.displayAccountDetails();

        System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
