package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile("Samsung", "White", 70));
        mobileList.add(new Mobile("Nokia", "Golden", 50));
        mobileList.add(new Mobile("Iphone", "Black", 100));
        mobileList.add(new Mobile("Google", "Orange", 90));
        mobileList.add(new Mobile("Realme", "Blue", 60));

        mobileList.sort(new NameComparator());
//        mobileList.sort(new colourComparator());
//        mobileList.sort(new priceComparator());
        mobileList.forEach(System.out::println);
    }
}
