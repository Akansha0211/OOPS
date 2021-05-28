package oops.sTatic;
import oops.sTatic.A.B;

public class StaticKeyword {

    public static void main(String[] args) {
        A objA = new A();
//        A.B objB = objA.new B();
        B objB = objA.new B();
    }
}
