import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Student[] st=new Student[10];
    College[] co=new College[10];
    Employee[] em=new Employee[10];

        System.out.println("Enter the number of students,employees and colleges");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name and USN:");
            String name=sc.next();
            String USN=sc.next();
            System.out.println("Enter streetnum,city,state,country");
            String sn=sc.next();
            String ci=sc.next();
            String sta=sc.next();
            String cou=sc.next();
            Address as=new Address(sn,ci,sta,cou);
            st[i]=new Student(name,USN,as);
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name and empID:");
            String name=sc.next();
            String USN=sc.next();
            System.out.println("Enter streetnum,city,state,country");
            String sn=sc.next();
            String ci=sc.next();
            String sta=sc.next();
            String cou=sc.next();
            Address as=new Address(sn,ci,sta,cou);
            em[i]=new Employee(USN,name,as);
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter college name:");
            String name=sc.next();
            System.out.println("Enter streetnum,city,state,country");
            String sn=sc.next();
            String ci=sc.next();
            String sta=sc.next();
            String cou=sc.next();
            Address as=new Address(sn,ci,sta,cou);
            co[i]=new College(name,as);
        }

        System.out.println("Student details:");
        for(int i=0;i<n;i++)
        {
            st[i].displayStudent(st[i].addr);
        }

        System.out.println("Employee details:");
        for(int i=0;i<n;i++)
        {
            em[i].displayEmployee(em[i].addr);
        }

        System.out.println("College details:");
        for(int i=0;i<n;i++)
        {
            co[i].displayCollege(co[i].addr);
        }

    }
}