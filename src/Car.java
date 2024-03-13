public class Car {
    String name;
    String colour;
    Integer engineNo;

    public Car(String name, String colour, Integer engineNo) {
        this.name = name;
        this.colour = colour;
        this.engineNo = engineNo;
    }

    // There are 4 types of method
// 1) Return = void   &&   args = void :
    public void breaks() {

    }

    // 2) Return = given   &&   args = void :
    public Integer speed() {
        return 1;
    }

    // 3) Return = void   &&   args = given :
    public void checkSpeeed(Integer num1, Boolean condition) {
        // return void h is lie return likhne ki zarrorat nh h agr given hota to return krna prta
    }

    // 4) Return = given   &&   args = given :
    public Boolean kuchBhi(Boolean koiBhi) {
        // return hm variable bhi kraskte hn y arg bhi
        return koiBhi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", engineNo=" + engineNo +
                '}';
    }
}
