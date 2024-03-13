package Inheritance;

public class Cat extends Animals {

    public Cat(String name, String breed) {
        super(name, breed);
    }

    public void meow() {
        System.out.println("meow");
    }

}
