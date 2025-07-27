package oops;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class over {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
