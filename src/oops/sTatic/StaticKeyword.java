package oops.sTatic;
import oops.sTatic.A.B;
import oops.sTatic.A.C;

public class StaticKeyword {
    static {
        System.out.println("in block 1");
    }
    static {
        System.out.println("in block 2");
    }
    public static void main(String[] args) {
        A objA = new A();
        //tightly coupled inner class...
//        A.B objB = objA.new B();
        B objB = objA.new B();

        C objC = new A.C(); // not so tightly coupled...

        System.out.println("inside main");
    }
}
