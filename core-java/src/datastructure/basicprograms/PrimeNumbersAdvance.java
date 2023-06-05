package datastructure.basicprograms;

import java.util.Arrays;
public class PrimeNumbersAdvance {
        public static void main(String[] args) {
            int limit = 100; // Set the upper limit to find prime numbers
            
            boolean[] isPrime = new boolean[limit + 1];
            Arrays.fill(isPrime, true); // Initialize all numbers as prime
            
            // Mark numbers that are not prime
            for (int i = 2; i * i <= limit; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= limit; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
            
            // Print prime numbers
            System.out.println("Prime numbers up to " + limit + ":");
            for (int i = 2; i <= limit; i++) {
                if (isPrime[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
