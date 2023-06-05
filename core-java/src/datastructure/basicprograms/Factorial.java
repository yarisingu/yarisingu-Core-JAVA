package datastructure.basicprograms;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // The number to calculate the factorial

        int factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

