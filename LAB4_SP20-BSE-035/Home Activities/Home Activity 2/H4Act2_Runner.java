public class H4Act2_Runner
{
    public static void main(String[] args)
    {
        Account acc1 = new Account();

        acc1.setBalance(2500);

        Account acc2 = new Account(acc1.getBalance());

        acc1.withdraw(1200);
        acc2.deposit(1200);

        System.out.println("Account1: " + acc1.getBalance());
        System.out.println("Account2: " + acc2.getBalance());
    }
}
