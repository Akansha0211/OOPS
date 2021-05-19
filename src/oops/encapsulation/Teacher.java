package oops.encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student obj = new Student("Akansha");
        obj.resultGrade(); // default method can be accesed within same package
    }
}
