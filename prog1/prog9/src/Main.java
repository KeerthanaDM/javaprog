import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       arrayListOper colors=new arrayListOper();
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of colors:");
        int n=sc.nextInt();
        System.out.print("Enter the colors:");
        for(int i=0;i<n;i++) colors.addEle(sc.next());


        String[] arr=  colors.copyToArray();
        for(String x:arr) System.out.print(x+" ");

        System.out.println("Reverse:"+colors.reverse());

        System.out.println("Sorted order: "+colors.sort());

        System.out.println("Enter start and end indices:");
        int st=sc.nextInt(); int en=sc.nextInt();
        System.out.println("sub array: "+colors.sublist(st,en));


        System.out.println("clone= "+colors.getClone());
    }
}