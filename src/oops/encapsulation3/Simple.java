package oops.encapsulation3;


import java.lang.reflect.Method;

public class Simple {
    public static void main(String[] args)throws Exception{
//        A obj = new A(45);
//        System.out.println(obj.data); // gives Compile-time error

//        A obj = new A();
//        System.out.println(obj.getData());

        //Can you access private method outside Class?? ->YES using Reflection API
//        1. use reflect package 
//        2. Use Exception class inside driver code
//        3. getDeclaredMethod("method")
      A obj = new A();
      Method m = A.class.getDeclaredMethod("msg");
      m.setAccessible(true); // necessary step
      m.invoke(obj);


    }
}
