package inheritance;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }

    public void fetch() {
        System.out.println("The dog fetches a ball.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.speak(); // Output: The dog barks.
        myDog.fetch(); // Output: The dog fetches a ball.
    }
}

