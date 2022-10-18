import java.lang.*;
public class DemonetizationException extends Exception{
    int amount;
    String type;

    public DemonetizationException(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type+"currency of "+amount+" cannot be deposited.";
    }
}
