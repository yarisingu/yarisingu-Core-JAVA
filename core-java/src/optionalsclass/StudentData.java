package optionalsclass;

public class StudentData {

    private String name;
    private int age;

    // Constructor
    public StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }

     // Getter for name
     public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
}
