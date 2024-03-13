package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Mobile> {

    @Override
    public int compare(Mobile o1, Mobile o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
