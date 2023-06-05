package datastructure.algorithms.dynamicprogrammingalgorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSequence {

        private static Map<Integer, Long> fibonacciCache = new HashMap<>();
    
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt(); // The nth Fibonacci number to calculate
   
                long fibonacciNumber = calculateFibonacci(n);
   
                System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
            }
        }
    
        private static long calculateFibonacci(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Invalid input. n cannot be negative.");
            }
    
            if (fibonacciCache.containsKey(n)) {
                return fibonacciCache.get(n);
            }
    
            long fibonacciNumber;
            if (n <= 1) {
                fibonacciNumber = n;
            } else {
                fibonacciNumber = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
            }
    
            fibonacciCache.put(n, fibonacciNumber);
            return fibonacciNumber;
        }
    }
    