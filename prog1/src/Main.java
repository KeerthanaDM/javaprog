import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the complex number 1:");
        System.out.println("Enter the real part and imaginary part:");
        int real1=sc.nextInt();
        int img1=sc.nextInt();
        cn c1=new cn(real1,img1);

        System.out.println("Enter the complex number 2:");
        System.out.println("Enter the real part and imaginary part:");
        int real2=sc.nextInt();
        int img2=sc.nextInt();
        cn c2=new cn(real2,img2);

        System.out.println("Enter the complex number 3:");
        System.out.println("Enter the real part and imaginary part:");
        int real3=sc.nextInt();
        int img3=sc.nextInt();
        cn c3=new cn(real3,img3);

        cn sum=new cn();
        sum=sum.add2(c1,c2);
        sum.display();
        sum=sum.add3(c1,c2,c3);
        sum.display();
        sum=sum.sub(c1,c2);
        sum.display();
    }
}