package oops.sTatic;
import oops.sTatic.A.B;
import oops.sTatic.A.C;

public class StaticKeyword {

    public static void main(String[] args) {
        A objA = new A();
//        A.B objB = objA.new B();
        B objB = objA.new B();

        C objC = new A.C();
    }
}
