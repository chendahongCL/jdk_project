package chapter2;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog eat===");
    }

    @Override
    public void run() {
        System.out.println("dog run===");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep===");
    }
}
