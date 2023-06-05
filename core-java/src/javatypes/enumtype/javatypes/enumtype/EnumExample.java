package javatypes.enumtype;

public class EnumExample {
    // Declare an enum type called Fruit
    public enum Fruit {
        APPLE,
        BANANA,
        ORANGE,
        MANGO
    }

    public static void main(String[] args) {
        // Using enum constants
        Fruit favoriteFruit = Fruit.APPLE;
        System.out.println("My favorite fruit is " + favoriteFruit);

        // Comparing enum constants
        Fruit fruit1 = Fruit.APPLE;
        Fruit fruit2 = Fruit.BANANA;
        Fruit fruit3 = Fruit.APPLE;

        System.out.println(fruit1 + " vs " + fruit2 + ": " + (fruit1 == fruit2));
        System.out.println(fruit1 + " vs " + fruit3 + ": " + (fruit1 == fruit3));

        // Iterating over enum constants
        System.out.println("Available fruits:");
        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit);
        }
    }
}
