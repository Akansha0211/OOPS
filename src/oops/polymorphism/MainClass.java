package oops.polymorphism;

public class MainClass {
    public static void main(String[] args) {

        //RUN TIME POLYMORPHISM...
        Dog d = new Dog();
        Pet p = d; // upcasting
        Animal a = d;// upcasting

        d.walk();
        p.walk();
//        a.walk(); GIVES ERROR
    }
}
