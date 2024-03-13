package FunctionalInterfaceAndLambda;

public interface Vehicle {

    default void horn() {
        System.out.println("Beep Beep");
    }
}
