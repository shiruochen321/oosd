public class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private static int nextAccountNumber = 1;
    
    private final int accountNumber;
    private double savingsBalance;
    
    public SavingsAccount(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.savingsBalance = initialBalance;
    }
    
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }
    
    public static void modifyInterestRate(double newAnnualRate) {
        if (newAnnualRate >= 0) {
            annualInterestRate = newAnnualRate / 100.0;
        }
    }
    
    public int getAccountNumber() { return accountNumber; }
    public double getSavingsBalance() { return savingsBalance; }
    public static double getAnnualInterestRate() { return annualInterestRate * 100; }
    
    @Override
    public String toString() {
        return String.format("Account #%d: Balance = €%.2f", accountNumber, savingsBalance);
    }

}
