public class BankCustomer {
     private String name;
    private String address;
    private SavingsAccount[] accounts;
    private int accountCount;
    
    public BankCustomer(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new SavingsAccount[3];
        this.accountCount = 0;
    }
    
    public boolean addAccount(SavingsAccount account) {
        if (accountCount < 3) {
            accounts[accountCount] = account;
            accountCount++;
            return true;
        } else {
            System.out.println("Error: Maximum of 3 accounts per customer reached!");
            return false;
        }
    }
    
    public double balance() {
        double total = 0.0;
        for (int i = 0; i < accountCount; i++) {
            total += accounts[i].getSavingsBalance();
        }
        return total;
    }
    
    public void summary() {
        System.out.println("\n=== Customer Summary ===");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Number of Accounts: " + accountCount);
        System.out.println("Account Details:");
        
        for (int i = 0; i < accountCount; i++) {
            System.out.printf("  Account #%d: €%.2f%n", 
                accounts[i].getAccountNumber(), 
                accounts[i].getSavingsBalance());
        }
        System.out.printf("Total Balance: €%.2f%n", balance());
    }
    
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getAccountCount() { return accountCount; }
    
    @Override
    public String toString() {
        return String.format("Customer: %s, Address: %s, Accounts: %d, Total: €%.2f", 
            name, address, accountCount, balance());
    }

}
