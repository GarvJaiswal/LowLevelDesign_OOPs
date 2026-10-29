package Class_11;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.getQuantity(), o2.getQuantity());
    }
}
