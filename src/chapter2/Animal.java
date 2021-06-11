package chapter2;

public interface Animal {
    void eat();

    void run();

    default void breath() {
        System.out.println("breath===");
    }

    default void sleep() {
        System.out.println("sleep===");
    }

    static void test1() {
        System.out.println("test1===");
    }

    static void test2() {
        System.out.println("test2===");
    }
}
