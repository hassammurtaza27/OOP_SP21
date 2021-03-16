public class Account
{
    private double balance;

    Account()
    {
        balance = 0;
    }

    Account(double bal)
    {
        balance = bal;
    }

    void setBalance(double bal)
    {
        balance = bal;
    }

    void deposit(double amount)
    {
        balance += amount;
    }

    void withdraw(double amount)
    {
        balance -= amount;
    }

    double getBalance()
    {
        return balance;
    }
}
