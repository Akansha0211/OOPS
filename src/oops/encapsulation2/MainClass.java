package oops.encapsulation2;

//import oops.encapsulation.Student;
//import oops.encapsulation.Teacher;
import oops.encapsulation.*;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Student obj = new Student("Tom");
//        gives error if name is private(can only be accessed within same class
//        obj.name = "Harry";

//        obj.getPassword(); will give error as this method is private

//        obj.resultGrade(); default modifier gives access only within same package
        Teacher teacher = new Teacher();

        Scanner sc = new Scanner(System.in);


    }
}
