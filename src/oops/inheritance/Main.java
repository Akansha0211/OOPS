package oops.inheritance;

public class Main {
    public static void main(String[] args) {
//        Teacher t = new Teacher();

//        t.name = "DBC";
//        t.eat();
//        t.walk();
//        t.teach();
//
//        Singer s = new Singer();
//        s.name = "Oprah";
//        s.sing();
//        s.eat();

//        Person p = t; // upcasting(implicit casting)

//        Will give exception
//        Person p = new Person();
//        Teacher t = (Teacher)p; // downcasting

        //No error : -> Person p is actually a Teacher
//        Teacher t1 = new Teacher();
//        Person p = t1;
//        Teacher t = (Teacher)p;

        //NO error at COMPILE TIME , but will give error at RUN TIME
//        Teacher t1 = new Teacher();
//        Singer s1 = new Singer();
//        Person p = s1;
//        Teacher t = (Teacher)p;

//        Teacher t1 = new Teacher();
//
//        //To tell whether the object is an instance of particular class or not...
//        boolean yo = t1 instanceof Teacher;
//        System.out.println(yo);
//        Singer s1 = new Singer();
//        System.out.println(s1 instanceof Singer);
//        System.out.println(t1 instanceof Person);
//
//        Person p = t1;
//        Teacher t = (Teacher)p;
//        System.out.println(p instanceof Singer);
//        System.out.println(p instanceof Teacher);

        //super kewyword inside method
//        Teacher t1 = new Teacher();
//        t1.name="DBC Sir";
//        t1.eat();
        Teacher t1 = new Teacher("DBC Sir");
        t1.eat();
    }
}
