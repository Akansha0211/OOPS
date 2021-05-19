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

        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

}
