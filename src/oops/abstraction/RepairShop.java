package oops.abstraction;

public class RepairShop {
    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        Audi audi = new Audi();
        repairCar(wagonR);
        repairCar(audi);
    }
//    public static void repairCar(WagonR car){
//        System.out.println("car is repaired");
//    }
////    for audi
//    public static void repairCar(Audi car){
//        System.out.println("car is repaired");
//    }
    public static void repairCar(Car car){
        System.out.println("car is repaired");
    }
}
