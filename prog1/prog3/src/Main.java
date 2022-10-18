import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Cylinder 1 details:");
        System.out.println("Enter the height");
        double h1=sc.nextDouble();
        System.out.println("Enter the radius:");
        double r1=sc.nextDouble();
        System.out.println("Enter the color");
        String color1=sc.next();

        Cylinder c1=new Cylinder(r1,h1,color1);


        System.out.println("Cylinder 2 details:");
        System.out.println("Enter the height");
        double h2=sc.nextDouble();
        System.out.println("Enter the radius:");
        double r2=sc.nextDouble();
        System.out.println("Enter the color");
        String color2=sc.next();

        Cylinder c2=new Cylinder(r2,h2,color2);

        if(c1.getArea()==c2.getArea() && c1.getVolume()==c2.getVolume() && c1.color.equalsIgnoreCase(c2.color))
            System.out.println("The cylinders are same");
        else System.out.println("The cylinders are different");
    }
}