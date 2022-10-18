public class Snake implements Animal{
    @Override
    public void eat() {
        System.out.println("snake eats smaller reptiles");
    }

    @Override
    public void sound() {
        System.out.println("snake hisses");
    }

    public void harm()
    {
        System.out.println("snakes can be harmless");
    }
}
