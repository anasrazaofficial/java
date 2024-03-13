package Polymorphism;

public class cat extends animal {

    // Over load
    public void run() {
        System.out.println("hello");
    }

    public void run(String any) {
        System.out.println(any);
    }

    //Over ride
    @Override
    public void voice() {
        System.out.println("meow");

    }


}
