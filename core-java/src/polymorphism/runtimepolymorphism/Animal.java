package polymorphism.runtimepolymorphism;

public class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
} 
    

