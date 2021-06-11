import java.io.*;
import java.util.Scanner;

public class Assignment implements Serializable
{
    private double balance;
    private String accountNo;
    private static Assignment[] accounts = new Assignment[10];


    public static void main(String[] args) throws IOException
    {
        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Accounts.dat"));
        Assignment a1 = new Assignment(100, "a1");
        Assignment a2 = new Assignment(200, "a2");
        Assignment a3 = new Assignment(300, "a3");
        Assignment a4 = new Assignment(400, "a4");
        Assignment a5 = new Assignment(500, "a5");
        Assignment a6 = new Assignment(600, "a6");
        Assignment a7 = new Assignment(30, "a7");
        Assignment a8 = new Assignment(90, "a8");
        Assignment a9 = new Assignment(10, "a9");
        Assignment a10 = new Assignment(0, "a10");

        oos.writeObject(a1);
        oos.writeObject(a2);
        oos.writeObject(a3);
        oos.writeObject(a4);
        oos.writeObject(a5);
        oos.writeObject(a6);
        oos.writeObject(a7);
        oos.writeObject(a8);
        oos.writeObject(a9);
        oos.writeObject(a10);

        oos.close();*/

        Scanner input = new Scanner(System.in);


        System.out.println("Enter 1 to deposit");
        System.out.println("Enter 2 to withdraw");
        System.out.println("Enter 3 to transfer");
        System.out.println("Enter 4 to get balance");
        System.out.println("Enter 5 to exit");
        boolean loop = true;
        int opt = input.nextInt();
        String acc;
        double bal;

        while (loop) {
            switch (opt) {
                case 1 -> {
                    System.out.println("Enter account number: ");
                    acc = input.next();
                    System.out.println("Enter the balance you want to deposit: ");
                    bal = input.nextDouble();
                    deposit(acc, bal);
                }
                case 2 -> {
                    System.out.println("Enter account number: ");
                    acc = input.next();
                    System.out.println("Enter the balance you want to withdraw: ");
                    bal = input.nextDouble();
                    withdraw(acc, bal);
                }
                case 3 -> {
                    System.out.println("Enter account number: ");
                    acc = input.next();
                    System.out.println("Enter the balance you want to transfer: ");
                    bal = input.nextDouble();
                    transfer(acc, bal);
                }
                case 4 -> {
                    System.out.println("Enter account number: ");
                    acc = input.next();
                    if (getBalance(acc) == -1) {
                        System.out.println("Invalid account number");
                    } else
                        System.out.println("The enquired balance is" + getBalance(acc));
                }
                case 5 -> loop = false;
                default -> System.out.println("Invalid input");
            }
        }

    }

    public Assignment(double balance, String accountNo)
    {
        this.balance = balance;
        this.accountNo = accountNo;
    }

    private static void writeFile() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Accounts.dat"));

        for (Assignment account: accounts)
        {
            oos.writeObject(account);
        }

        accounts = new Assignment[10];
    }

    public static void deposit(String accountNo, double amount) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Accounts.dat"));

        boolean eof = false;
        boolean done = false;
        int i = 0;
        while(!eof)
        {
            try
            {
                Assignment s = (Assignment)ois.readObject();
                System.out.println(s.accountNo);
                if (s.accountNo.equals(accountNo))
                {
                    s.balance += amount;
                    done = true;
                }
                accounts[i] = s;
                i++;
            }
            catch (EOFException | ClassNotFoundException e)
            {
                eof = true;
            }
        }
        ois.close();
        if (done)
        {
            System.out.println("Action completed successfully");
            writeFile();
        }
        else
            System.out.println("Invalid account number is given");
    }

    public static void withdraw(String accountNo, double amount) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Accounts.dat"));

        boolean eof = false;
        boolean done = false;
        int i = 0;
        while(!eof)
        {
            try
            {
                Assignment s = (Assignment)ois.readObject();
                if (s.accountNo.equals(accountNo))
                {
                    if (s.balance < amount)
                    {
                        System.out.println("Given amount is greater than current balance, cannot withdraw");
                        return;
                    }
                    else
                    {
                        s.balance -= amount;
                        done = true;
                    }
                }
                accounts[i] = s;
                i++;
            }
            catch (EOFException | ClassNotFoundException e)
            {
                eof = true;
            }
        }
        ois.close();
        if (done)
        {
            System.out.println("Action completed successfully");
            writeFile();
        }
        else
            System.out.println("Invalid account number is given");
    }

    public static void transfer(String accountNo, double amount) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Accounts.dat"));

        boolean eof = false;
        boolean done = false;
        int i = 0;
        while(!eof)
        {
            try
            {
                Assignment s = (Assignment)ois.readObject();
                if (s.accountNo.equals(accountNo))
                {
                    s.balance += amount;
                    done = true;
                }
                accounts[i] = s;
                i++;
            }
            catch (EOFException | ClassNotFoundException e)
            {
                eof = true;
            }
        }
        ois.close();
        if (done)
        {
            System.out.println("Action completed successfully");
            writeFile();
        }
        else
            System.out.println("Invalid account number is given");
    }

    public static double getBalance(String accountNo) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Accounts.dat"));

        boolean eof = false;
        while(!eof)
        {
            try
            {
                Assignment s = (Assignment)ois.readObject();
                if (s.accountNo.equals(accountNo))
                {
                    return s.balance;
                }
            }
            catch (EOFException | ClassNotFoundException e)
            {
                eof = true;
            }
        }
        ois.close();
        return -1;
    }

    public String toString()
    {
        return "Account number: " + accountNo +
                "\nCurrent Balance: " + balance;
    }
}
