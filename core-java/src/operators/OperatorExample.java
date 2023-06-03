package operators;

public class OperatorExample {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Assignment operators
        int x = 10;
        x += 5; // Equivalent to x = x + 5;
        System.out.println("x after addition assignment: " + x);

        // Comparison operators
        int p = 5;
        int q = 8;
        boolean isEqual = (p == q);
        boolean isNotEqual = (p != q);
        boolean isGreaterThan = (p > q);
        boolean isLessThan = (p < q);
        boolean isGreaterThanOrEqual = (p >= q);
        boolean isLessThanOrEqual = (p <= q);

        System.out.println("Is equal: " + isEqual);
        System.out.println("Is not equal: " + isNotEqual);
        System.out.println("Is greater than: " + isGreaterThan);
        System.out.println("Is less than: " + isLessThan);
        System.out.println("Is greater than or equal to: " + isGreaterThanOrEqual);
        System.out.println("Is less than or equal to: " + isLessThanOrEqual);

        // Logical operators
        boolean bool1 = true;
        boolean bool2 = false;
        boolean logicalAnd = bool1 && bool2;
        boolean logicalOr = bool1 || bool2;
        boolean logicalNot = !bool1;

        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Unary operators
        int num = 5;
        num++; // Equivalent to num = num + 1;
        int negation = -num;

        System.out.println("Incremented value: " + num);
        System.out.println("Negation: " + negation);

        // Ternary operator
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Voting eligibility: " + eligibility);
    }
}

