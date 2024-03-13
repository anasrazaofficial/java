package Generic;

public class Generic<T> {

    public void hello(T value) {
        if (value instanceof String) {

            System.out.println(value.getClass().toString() + " = " + value);
        } else if (value instanceof Integer) {
            System.out.println(value.getClass().toString() + " = " + value);
        } else if (value instanceof Boolean) {
            System.out.println(value.getClass().toString() + " = " + value);
        } else {
            System.out.println(value.getClass().toString() + " = " + value);
        }

    }


    public T fruit(T value) {
        System.out.println(value.getClass().toString());
        return value;
    }
}
