import java.util.ArrayList;

public class Market {
    ArrayList<String> fruits;
    int n;

    public Market(int n) {
        this.fruits = new ArrayList<>();
        this.n = n;
    }

    synchronized boolean isFull()
    {
        return fruits.size()==n;
    }

    synchronized  boolean isEmpty()
    {
        return fruits.size()==0;
    }

    synchronized void farmer(String fruit) throws InterruptedException {
        if(isFull()) {
            System.out.println("Waiting for consumer to consume");
            wait();
        }
        fruits.add(fruit);
        notify();
        Thread.sleep(1000);
    }

    synchronized void consumer() throws InterruptedException {
        if(isEmpty()) {
            System.out.println("Waiting for farmer to produce");
            wait();
        }
        String str=fruits.remove(0);
        System.out.println("consumed: "+str);
        notify();
        Thread.sleep(1000);
    }
}
