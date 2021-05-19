package oops.encapsulation;

public class EncapsulationIntroduction {
    public static void main(String[] args) {

        Student1 st = new Student1();
//        st.name = "Harshit";
//        st.age = 23;

//        Now to achieve encapsulation
//                1. Declare the variables of a class as private
//                2. Provide public setter and getter methods that will be used to write and read these variables values.

        st.setName("Harshit"); // this makes a diff as you can now apply restrictions to it.
        st.setAge(23);

    }
}
