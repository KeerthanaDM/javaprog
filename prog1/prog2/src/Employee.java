public class Employee {
    String empID,name;
    Address addr;

    public Employee(String empID, String name, Address addr) {
        this.empID = empID;
        this.name = name;
        this.addr = addr;
    }

    public void displayEmployee(Address a)
    {
        System.out.println(empID+"\t\t\t"+name+"\t\t\t"+a.streetnum+","+a.city+","+a.state+","+a.country);
    }
}
