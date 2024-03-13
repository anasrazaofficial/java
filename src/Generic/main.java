package Generic;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Generic<String> genericString = new Generic();
//        genericString.hello("Hello world");

        Generic<Integer> genericInteger = new Generic();
//        genericInteger.hello(12);

        Generic<Boolean> genericBoolean = new Generic();
//        genericBoolean.hello(true);

        Obj<String, Integer> obj = new Obj("Anas", 18, "Karachi");
        Generic<Obj> genericObj = new Generic();
//        genericObj.hello(obj);

        Generic<String> genericFruit = new Generic();
//        System.out.println(genericFruit.fruit("Mango"));
//        genericFruit.fruit("Mango");

        Integer[] arr = {1, 2, 3, 4, 65, 2, 1};
//        PrintAllDataInArray.printArr(arr);

        Character[] charArr = {'h', 'o', 'e', 's', 'a', 's'};
//        PrintAllDataInArray.printArr(charArr);

        List<String> list = new ArrayList();
        list.add("Anas");
        list.add("Ahmed");
        list.add("Ahsan");
        list.add("Sharif");
        PrintAllDataInArray.printList(list);
    }
}
