// Example of Inheritance and Polymorphism in Java

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class animal {
    public static void main(String[] args) {
        // Polymorphism: Parent reference, child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();  // Calls Dog's sound()
        a2.sound();  // Calls Cat's sound()
    }
}
