package FunctionalInterfaceAndLambda;

public interface Car {
    void drive(String name);

    default void horn() {
        System.out.println("Beep Beep");
    }

    default void lightsOn() {
        System.out.println("Turning on lights");
    }
}
