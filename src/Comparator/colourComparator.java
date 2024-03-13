package Comparator;

import java.util.Comparator;

public class colourComparator implements Comparator<Mobile> {
    @Override
    public int compare(Mobile o1, Mobile o2) {
        return o1.getColour().compareTo(o2.getColour());
    }
}
