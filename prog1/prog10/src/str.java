import java.util.Scanner;

public class str {
    Scanner sc=new Scanner(System.in);
    void part1()
    {
        System.out.println("Print the penultimate word:");
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        String[] words=a.split(" ",0);
//        for(String x:words) System.out.println(x);
        System.out.println(words[words.length-2]);
    }
    void part2()
    {
        System.out.println("Interchange words \"java\" and \"python\"");
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        a=a.replace("java","temp");
        a=a.replace("python","java");
        a=a.replace("temp","python");
        System.out.println(a);
    }
    void part3()
    {
        System.out.println("Split string based on a special character:");
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        System.out.println("enter the character");
        String charr = sc.next();
        String[] arr=a.split(charr,0);
        for(String x:arr) System.out.print(x);
    }
}
