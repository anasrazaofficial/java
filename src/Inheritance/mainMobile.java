package Inheritance;

public class mainMobile {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("animaLInheritance.Iphone-X", "Golden", 60000);
        System.out.println(iphone);

        Nokia nokia = new Nokia("3310", "White", 1500);
        System.out.println(nokia);

        Samsung samsung = new Samsung("RMX-700", "Black", 30000);
        System.out.println(samsung);
        System.out.println("");

        iphone.turnOff();
        nokia.turnOff();
        samsung.turnOff();
    }
}
