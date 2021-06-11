package chapter2;

/**
 * jdk8接口default关键字 static方法
 */

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
