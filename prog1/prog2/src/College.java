public class College {
    String name;
    Address addr;

    public College(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    public void displayCollege(Address a)
    {
        System.out.println(name+"\t\t\t"+a.streetnum+","+a.city+","+a.state+","+a.country);
    }
}
