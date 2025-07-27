package oops;

abstract class First {
    int a, b;
    First(int x, int y) {
        a = x;
        b = y;
    }
    void sum() {
        System.out.println("Sum: " + (a + b));
    }
    abstract void sub();
    abstract void mul();
}
class Second extends First {
    Second() {
        super(10, 20);
    }
    void sub() {
        System.out.println("Sub: " + (a - b));
    }
    void mul() {
        System.out.println("Mul: " + (a * b));
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.sum();
        obj.sub();
        obj.mul();
    }
}
