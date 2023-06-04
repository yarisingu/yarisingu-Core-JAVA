package optionalsclass;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args)
    {
      // Cat mycat =   findByName("Tarun");
      // if(mycat!=null)
      // {
      //   System.out.println(mycat.getAge());
      // }
      // else{
      //   System.out.println(0);
      // }

     Optional<Cat> optionalmycat =   findByName("Tarun");
        // method 1
     if(optionalmycat.isPresent()){System.out.println(optionalmycat.get().getAge());}else{
      System.out.println("null"+"or"+0);
     }
     // method 2

     Cat elsemycat = optionalmycat.orElse(new Cat("Unknown",0));
     System.out.println(elsemycat);

     // method 3
     optionalmycat.map(Cat::getAge).orElse(0);

    }
    
    private static Optional<Cat> findByName(String name)
    {
        Cat cat = new Cat(name,3);

        return Optional.ofNullable(cat);
    }
}
