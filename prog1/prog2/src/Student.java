public class Student {
    String USN,name;
    Address addr;

    public Student(String USN, String name, Address addr) {
        this.USN = USN;
        this.name = name;
        this.addr = addr;
    }

    public void displayStudent(Address a)
    {
        System.out.println(USN+"\t\t\t"+name+"\t\t\t"+a.streetnum+","+a.city+","+a.state+","+a.country);
    }
}
