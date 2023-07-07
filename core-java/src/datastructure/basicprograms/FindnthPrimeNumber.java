package datastructure.basicprograms;

public class FindnthPrimeNumber {
    public static void main(String[] args) {
        int n = 1; // The nth prime number to find
        int count = 0; // Number of prime numbers found
        int number = 2; // Number to be checked for primality

        while (count < n) {
            if (isPrime(number)) {
                count++;
                if (count == n) {
                    System.out.println("The " + n + "th prime number is: " + number);
                    break;
                }
            }
            number++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
