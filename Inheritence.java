class Animal{
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Mammal extends Animal{
    void breathe() {
        System.out.println("Mammal breathes air");
    }
}

class Dog extends Mammal {
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
