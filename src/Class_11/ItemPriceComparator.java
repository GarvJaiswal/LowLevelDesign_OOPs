package Class_11;

import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return Double.compare(o1.getPrice(), o2.getPrice()); // Sorts on the Basis of Price ASC
    }
}
