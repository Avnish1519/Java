class A{
    void eat() {
        System.out.println("Animal eats food");
    }
}

class B extends A{
    void breathe() {
        System.out.println("Mammal breathes air");
    }
}

class C extends A {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class C extends A {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();     
        myDog.breathe(); 
        myDog.bark();    
    }
}
