public class H6Act1_Runner
{
    public static void main(String[] args)
    {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);
        SavingAccount.modifyInterestRate(3);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Savings Balance for first account with 3% annual interest rate: " + saver1.getSavingsBalance());
        System.out.println("Savings Balance for second account with 3% annual interest rate: " + saver2.getSavingsBalance());

        SavingAccount.modifyInterestRate(4);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nSavings Balance for first account with 4% annual interest rate: " + saver1.getSavingsBalance());
        System.out.println("Savings Balance for second account with 4% annual interest rate: " + saver2.getSavingsBalance());

    }
}
