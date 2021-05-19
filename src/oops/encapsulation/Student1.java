package oops.encapsulation;

public class Student1 {
    private int age;
    private String name;

    //To achieve encapsulation : make getters and setters for private fields to access them outside the class

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age>24){
            System.out.println("You are to old to  be a student...");
        }else{
            this.age = age;
        }

    }
    public void setName(String name){
        this.name = name;
    }

}
