import java.util.Calendar;

    public class BankingSystemDriver {
    public static void main(String[] args) {
        System.out.println("=== COMPLETE BANKING SYSTEM (Q1-Q3 INTEGRATED) ===\n");
        
        // Run Q1: Clock functionality
        testQ1_ClockFunctionality();
        
        // Run Q2: Savings Account functionality  
        testQ2_SavingsAccounts();
        
        // Run Q3: Bank Customer functionality
        testQ3_BankCustomers();
        
        // Integrated demonstration showing all components working together
        integratedBankingDemo();
    }
    
    // Q1: Clock functionality test
    public static void testQ1_ClockFunctionality() {
        System.out.println("=== Q1: CLOCK FUNCTIONALITY TEST ===");
        System.out.println("Creating Time object with current system time...");
        
        Calendar cal = Calendar.getInstance();
        Time currentTime = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
        
        System.out.println("Initial Military Time: " + currentTime.toMilitaryString());
        System.out.println("Initial Standard Time: " + currentTime.toString());
        System.out.println("Simulating clock ticks for 10 seconds...\n");
        
        int initialMinute = currentTime.getMinute();
        int secondsToSimulate = 10;
        int secondsSimulated = 0;
        
        System.out.println("Time progression:");
        System.out.println("Start: " + currentTime.toMilitaryString() + " | " + currentTime.toString());
        
        while (secondsSimulated < secondsToSimulate) {
            currentTime.tick();
            secondsSimulated++;
            
            System.out.println("Tick " + secondsSimulated + ": " + 
                             currentTime.toMilitaryString() + " | " + currentTime.toString());
            
            // Check if minute has advanced (original Q1 requirement)
            if (currentTime.getMinute() != initialMinute) {
                System.out.println("*** Minute has advanced! ***");
                break;
            }
            
            // Small delay for readability
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Q1 Clock test completed.\n");
    }
    
    // Q2: Savings Account test
    public static void testQ2_SavingsAccounts() {
        System.out.println("=== Q2: SAVINGS ACCOUNTS TEST ===");
        
        // Create accounts exactly as specified in Q2
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        
        System.out.println("Created savings accounts:");
        System.out.println("Saver1: " + saver1);
        System.out.println("Saver2: " + saver2);
        
        // Test with 4% interest rate (Q2 requirement)
        System.out.println("\n--- Month 1: Setting annual interest rate to 4% ---");
        SavingsAccount.modifyInterestRate(4.0);
        System.out.println("Current Annual Interest Rate: " + SavingsAccount.getAnnualInterestRate() + "%");
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("After calculating monthly interest:");
        System.out.println("Saver1: " + saver1);
        System.out.println("Saver2: " + saver2);
        
        // Test with 5% interest rate (Q2 requirement)
        System.out.println("\n--- Month 2: Setting annual interest rate to 5% ---");
        SavingsAccount.modifyInterestRate(5.0);
        System.out.println("Current Annual Interest Rate: " + SavingsAccount.getAnnualInterestRate() + "%");
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("After calculating next month's interest:");
        System.out.println("Saver1: " + saver1);
        System.out.println("Saver2: " + saver2);
        
        // Demonstrate automatic account numbering
        System.out.println("\n--- Testing automatic account numbering ---");
        SavingsAccount saver3 = new SavingsAccount(5000.00);
        SavingsAccount saver4 = new SavingsAccount(1000.00);
        System.out.println("New account created: " + saver3);
        System.out.println("New account created: " + saver4);
        
        System.out.println("Q2 Savings Accounts test completed.\n");
    }
    
    // Q3: Bank Customer test
    public static void testQ3_BankCustomers() {
        System.out.println("=== Q3: BANK CUSTOMERS TEST ===");
        
        // Create customers (Q3 requirement)
        BankCustomer customer1 = new BankCustomer("John Smith", "123 Main Street");
        BankCustomer customer2 = new BankCustomer("Jane Doe", "456 Oak Avenue");
        
        System.out.println("Created bank customers:");
        System.out.println("Customer 1: " + customer1);
        System.out.println("Customer 2: " + customer2);
        
        // Create accounts for customers
        SavingsAccount acc1 = new SavingsAccount(2000.00);
        SavingsAccount acc2 = new SavingsAccount(3000.00);
        SavingsAccount acc3 = new SavingsAccount(5000.00);
        SavingsAccount acc4 = new SavingsAccount(1000.00);
        
        // Add accounts to customers (Q3 requirement)
        System.out.println("\n--- Adding accounts to customers ---");
        customer1.addAccount(acc1);
        customer1.addAccount(acc2);
        customer2.addAccount(acc3);
        customer2.addAccount(acc4);
        
        // Display customer summaries (Q3 requirement)
        System.out.println("\n--- Customer Summaries ---");
        customer1.summary();
        customer2.summary();
        
        // Test account limit of 3 accounts per customer (Q3 requirement)
        System.out.println("\n--- Testing maximum account limit (3 accounts per customer) ---");
        SavingsAccount acc5 = new SavingsAccount(8000.00);
        SavingsAccount acc6 = new SavingsAccount(6000.00);
        SavingsAccount acc7 = new SavingsAccount(4000.00);
        
        System.out.println("Adding 3rd account to Customer 1:");
        boolean success1 = customer1.addAccount(acc5);
        System.out.println("Operation successful: " + success1);
        
        System.out.println("Attempting to add 4th account to Customer 1:");
        boolean success2 = customer1.addAccount(acc6);
        System.out.println("Operation successful: " + success2);
        
        System.out.println("Attempting to add 5th account to Customer 1:");
        boolean success3 = customer1.addAccount(acc7);
        System.out.println("Operation successful: " + success3);
        
        // Final summary
        System.out.println("\n--- Final Customer Status ---");
        customer1.summary();
        
        // Test balance calculation method (Q3 requirement)
        System.out.println("\n--- Testing balance calculation method ---");
        System.out.printf("Customer 1 total balance: €%.2f%n", customer1.balance());
        System.out.printf("Customer 2 total balance: €%.2f%n", customer2.balance());
        
        System.out.println("Q3 Bank Customers test completed.\n");
    }
    
    // Integrated demonstration showing all components working together
    public static void integratedBankingDemo() {
        System.out.println("=== INTEGRATED BANKING SYSTEM DEMONSTRATION ===");
        System.out.println("Showing how Q1, Q2, and Q3 components work together...\n");
        
        // Get current time for the banking operation
        Calendar cal = Calendar.getInstance();
        Time bankingTime = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
        System.out.println("Banking operations started at: " + bankingTime.toString());
        
        // Create premium banking customers
        BankCustomer premiumCustomer = new BankCustomer("Robert Johnson", "789 Premium Lane");
        BankCustomer businessCustomer = new BankCustomer("Sarah Wilson", "321 Business Park");
        
        // Create multiple accounts with different balances
        SavingsAccount premiumAcc1 = new SavingsAccount(15000.00);
        SavingsAccount premiumAcc2 = new SavingsAccount(25000.00);
        SavingsAccount businessAcc1 = new SavingsAccount(35000.00);
        SavingsAccount businessAcc2 = new SavingsAccount(12000.00);
        SavingsAccount businessAcc3 = new SavingsAccount(18000.00);
        
        // Add accounts to customers
        premiumCustomer.addAccount(premiumAcc1);
        premiumCustomer.addAccount(premiumAcc2);
        businessCustomer.addAccount(businessAcc1);
        businessCustomer.addAccount(businessAcc2);
        businessCustomer.addAccount(businessAcc3);
        
        System.out.println("\n--- Initial Customer Portfolio ---");
        premiumCustomer.summary();
        businessCustomer.summary();
        
        // Simulate 6 months of banking operations with changing interest rates
        System.out.println("\n=== 6-MONTH FINANCIAL PROJECTION ===");
        
        double[] monthlyRates = {3.5, 4.0, 4.25, 4.5, 4.75, 5.0};
        
        for (int month = 0; month < 6; month++) {
            
            SavingsAccount.modifyInterestRate(monthlyRates[month]);
            
          
            premiumAcc1.calculateMonthlyInterest();
            premiumAcc2.calculateMonthlyInterest();
            businessAcc1.calculateMonthlyInterest();
            businessAcc2.calculateMonthlyInterest();
            businessAcc3.calculateMonthlyInterest();
            
       
            for (int day = 0; day < 30; day++) {
                for (int hour = 0; hour < 24; hour++) {
                    bankingTime.incrementHour();
                }
            }
            
            System.out.printf("\n--- Month %d (Interest Rate: %.2f%%) ---%n", 
                month + 1, monthlyRates[month]);
            System.out.printf("Premium Customer Total: €%.2f%n", premiumCustomer.balance());
            System.out.printf("Business Customer Total: €%.2f%n", businessCustomer.balance());
            System.out.println("Current System Time: " + bankingTime.toString());
        }
        
        // Final results
        System.out.println("\n=== FINAL RESULTS AFTER 6 MONTHS ===");
        System.out.println("Final System Time: " + bankingTime.toString());
        premiumCustomer.summary();
        businessCustomer.summary();
        
        double totalBankAssets = premiumCustomer.balance() + businessCustomer.balance();
        System.out.printf("\nTotal Bank Assets Under Management: €%.2f%n", totalBankAssets);
        
        System.out.println("\n=== BANKING SYSTEM DEMONSTRATION COMPLETE ===");
    }
    }

