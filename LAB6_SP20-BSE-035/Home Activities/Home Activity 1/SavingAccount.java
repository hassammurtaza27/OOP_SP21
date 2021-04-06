public class SavingAccount
{
    private static double annualInterestRate;
    private double savingsBalance;

    SavingAccount(double bal)
    {
        savingsBalance = bal;
        annualInterestRate = 0;
    }

    void calculateMonthlyInterest()
    {
        savingsBalance += savingsBalance * (annualInterestRate / 12);
    }

    static void modifyInterestRate(double air)
    {
        annualInterestRate = air;
    }

    double getSavingsBalance()
    {
        return savingsBalance;
    }
}
