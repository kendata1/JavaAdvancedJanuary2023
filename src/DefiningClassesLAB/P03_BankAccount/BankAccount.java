package src.DefiningClassesLAB.P03_BankAccount;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;

    private double balance;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int accountsCount = 0;
    private static int id;

    public BankAccount() {
        accountsCount++;
        this.id = accountsCount;
        this.balance = 0;
    }
    public int getId() {
        return this.id;
    }

    static void setInterestRate (double interestRate){
        BankAccount.interestRate = interestRate;
    }

    void deposit (double amount){
        balance += amount;
    }

    double getInterestRate (int years){
        return  BankAccount.interestRate * years * this.balance;
    }


}
