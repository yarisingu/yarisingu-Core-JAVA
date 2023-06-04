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

     Optional<StudentData> optionalmydata =   findByName("Tarun");
        // method 1
     if(optionalmydata.isPresent()){System.out.println(optionalmydata.get().getAge());}else{
      System.out.println("null"+"or"+0);
     }
     // method 2

     StudentData elsemycat = optionalmydata.orElse(new StudentData("Unknown",0));
     System.out.println(elsemycat);

     // method 3
     optionalmydata.map(StudentData::getAge).orElse(0);

    }
    
    private static Optional<StudentData> findByName(String name)
    {
        StudentData data = new StudentData(name,3);

        return Optional.ofNullable(data);
    }
}
