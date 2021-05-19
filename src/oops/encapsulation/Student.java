package oops.encapsulation;

public class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }
    public String getName(){
        getPassword(); // this private method can be accessed anywhere within same class
        return name;
    }
    private String getPassword(){
        return "hshsj";
    }

    String resultGrade(){
        return "A";
    }
}
