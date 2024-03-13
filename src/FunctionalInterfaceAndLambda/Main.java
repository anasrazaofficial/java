package FunctionalInterfaceAndLambda;

public class Main {
    public static void main(String[] args) {
//        Car honda=new Honda();
//        honda.drive();

        Car gfc = (name) -> {
            System.out.println("Honda is dirving (Lambda)");
        };
        gfc.drive("Anas");
    }
}
