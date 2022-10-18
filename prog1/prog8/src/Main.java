import java.util.Scanner;

public class Main {
    @FunctionalInterface
    interface performOperation{
        boolean operation(int num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       performOperation checkEven=(int v)->v%2==0;
       performOperation checkPrime=(int v)->{
           for(int i=2;i<Math.sqrt(v);i++)
           {
               if(v%i==0) return false;
           }
           return true;
       };
       performOperation palindrome=(int v)->{
           String str=String.valueOf(v);
           StringBuilder st=new StringBuilder(str);
           st.reverse();
           String rev=st.toString();
           if(rev.equals(str)) return true;
           return false;
        };


       int n;
        System.out.println("Enter the number for which you have to check even or odd");
        n=sc.nextInt();
        boolean isPrime=checkPrime.operation(n);
        boolean isEven=checkEven.operation(n);
        boolean isPalindrome=palindrome.operation(n);
        System.out.println(isEven+" "+isPrime+" "+isPalindrome);
    }
}