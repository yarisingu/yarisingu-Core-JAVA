package datastructure.basicprograms;


    
import java.util.HashMap;
import java.util.Map;
public class FactorialAdvance {

    
        private static Map<Integer, Long> factorialCache = new HashMap<>();
    
        public static void main(String[] args) {
            int number = 10; // The number to calculate the factorial
    
            long factorial = calculateFactorial(number);
    
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    
        private static long calculateFactorial(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative.");
            }
    
            if (factorialCache.containsKey(number)) {
                return factorialCache.get(number);
            }
    
            if (number == 0 || number == 1) {
                factorialCache.put(number, 1L);
                return 1;
            }
    
            long factorial = number * calculateFactorial(number - 1);
            factorialCache.put(number, factorial);
            return factorial;
        }
    }
    
