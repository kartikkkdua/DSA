// B. Method Overriding (Runtime)
// Child class defines the same method as the parent with same signature.



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

public class TestOverride {
    public static void main(String[] args) {
        Animal a = new Dog();  
        a.sound();             
    }
}
