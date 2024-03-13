package FunctionalInterfaceAndLambda;

public class Honda implements Car, Vehicle {
    @Override
    public void drive(String name) {
        System.out.println("Honda is driving");
    }

    @Override
    public void horn() {
        System.out.println("honda");
    }

//    @Override
//    public void horn() {
//        Car.super.horn();Override
//    }

//    @Override
//    public void horn() {
//        Vehicle.super.horn();
//    }
}
