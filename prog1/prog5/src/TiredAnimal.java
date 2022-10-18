public interface TiredAnimal extends Animal{
    @Override
    default void eat() {
        System.out.println("Animal is tired and hungry");
    }

    @Override
    default void sound() {
        System.out.println("Animal is silent");
    }
}
