interface Bank 
{
    void deposit(double amount);
    void withdraw(double amount);
}

class Account implements Bank 
{
    private double balance;
    public Account(double initialBalance) 
    {
        this.balance = initialBalance;
    }
    @Override
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
        else 
        {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } 
        else 
        {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void displayBalance() 
    {
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankDemo 
{
    public static void main(String[] args) 
    {
        Account myAccount = new Account(1000);
        myAccount.displayBalance();
        myAccount.deposit(500);
        myAccount.displayBalance();
        myAccount.withdraw(300);
        myAccount.displayBalance();
        myAccount.withdraw(1500);
        myAccount.displayBalance();
    }
}
