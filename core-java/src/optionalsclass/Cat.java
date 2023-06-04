package optionalsclass;

public class Cat {

    private String name;
    private int age;

    // Constructor
    public Cat(String name, int age) {
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
}
