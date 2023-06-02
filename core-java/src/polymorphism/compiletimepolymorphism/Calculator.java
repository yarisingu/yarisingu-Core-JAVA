package polymorphism.compiletimepolymorphism;

public class Calculator {

    public static void main(String[] args) {
        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.add(1.0,23.0));
    }

    static int add(int a, int b) {
        return a + b;
    }
  
    static double add(double a, double b) {
        return a + b;
    }
}
