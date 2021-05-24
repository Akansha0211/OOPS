package oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "DBC";
        t.eat();
        t.walk();
        t.teach();

        Singer s = new Singer();
        s.name = "Oprah";
        s.sing();
        s.eat();
    }
}
