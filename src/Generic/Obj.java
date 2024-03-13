package Generic;

public class Obj<T, K> {
    private T name;
    private K age;
    private T city;

    public Obj(T name, K age, T city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "name=" + name +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}
