import java.util.Scanner;

public class Customer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter your choice:");
        Account ac = new Account();
        do{
            System.out.println("1.Deposit\n2.Withdraw\n3.Display current balance");
            ch = sc.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("Enter the amount to be deposited.");
                int amt = sc.nextInt();
                System.out.println("enter the type of currency");
                String type = sc.next();
                try {
                    ac.deposit(amt, type);
                } catch (DemonetizationException e) {
                    System.out.println("permission denied");
                }
                break;
            }
            case 2: {
                System.out.println("Enter the amount to be withdrawn");
                int amt = sc.nextInt();
                ac.withdraw(amt);
                break;
            }
            case 3: {
                System.out.println("current balance is " + ac.currBalance());
                break;
            }
        }
        }while(ch<4);
    }
}
