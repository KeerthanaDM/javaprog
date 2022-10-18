public class Account{
    int balance;

    public Account() {
        this.balance = 500;
    }

    void deposit(int amount,String type) throws DemonetizationException
    {
        if(amount>=5000 && type.equals("old")) throw new DemonetizationException(amount);
        balance+=amount;
        System.out.println("Successfully deposited");
        System.out.println("Available balance is :"+balance);
    }

    public int currBalance() {
        return balance;
    }

    public void withdraw(int amount)
    {
        balance-=amount;
        if(balance<=500) {
            System.out.println("Withdrawal denied");
            balance+=amount;
            System.out.println("Current balance is :"+currBalance());
        }
        else {
            System.out.println(amount+" withdrawn successfully");
            System.out.println("available balance is :"+currBalance());
        }
    }
}
