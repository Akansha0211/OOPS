package oops.encapsulation3;

public class Simple {
    public static void main(String[] args) {
//        A obj = new A(45);
//        System.out.println(obj.data); // gives Compile-time error

        A obj = new A();
        System.out.println(obj.getData());
        
    }
}
