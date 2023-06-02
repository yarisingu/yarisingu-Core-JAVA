package composition.composition1;

public class CompositionClass {

    public static void main(String[] args) {

        objectclass.add(5,6);

        objectclass obj = new objectclass();
        // obj.add(4, 6); -> not posible due it's static method
        // A Class having object of another Class is called Composition
        System.out.println(obj.div(5.0, 6.0));
        System.out.println(obj.mul(5,6));
        obj.div1(5,6);
    }
}

class objectclass{

    public static void add(int i, int j)
    {
        System.out.println("The addition of "+ i +" and "+ j + " is "+ i+j);
    }

    public int mul(int i , int j)
    {
        return i*j;
    }

    public double div(double i, double j)
    {
        return i/j;
    }

    public  void div1(int i, int j)
    {
        System.out.println("The reminder of"+ i +" and "+j+" is "+ i%j);
    }
}
