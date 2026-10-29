package Class_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemDemo {
    public static void main(String[] args) {
//        List<Item> items = new ArrayList<>();
//
//        items.add(new Electronics("E101", "Laptop", 75000, 10, 2));
//        items.add(new Electronics("E102", "Headphones", 2500, 20, 1));
//
//        items.add(new Clothing("C101", "T-Shirt", 799, 50, "M"));
//        items.add(new Clothing("C102", "Jeans", 1999, 30, "L"));
//
//        items.add(new Book("B101", "Clean Code", 599, 15, "Robert C. Martin"));
//        items.add(new Book("B102", "Atomic Habits", 450, 25, "James Clear"));
//
//        Collections.sort(items);
//
//        for (Item item : items) {
//            System.out.println(item.getName());
//        }
        // ── Milestone 3: Recently Viewed Items ──
        System.out.println("\n=== M3: RecentlyViewedItems (LinkedList, max 10) ===");

        RecentlyViewedItems recents = new RecentlyViewedItems();

        for (int i = 1; i <= 10; i++) {
            recents.addRecentlyViewedItem(new Item("A-" + i, "Test Item " + i, 10, 10));
        }

        System.out.println("After adding 10: size=" + recents.getRecents().size());

        recents.addRecentlyViewedItem(new Item("A-11", "Test Item 11", 10, 10));
        System.out.println("After adding 11th: size=" + recents.getRecents().size());
        System.out.println("First (most recent): " + recents.getRecents().get(0));
        System.out.println("Last (oldest):       " + recents.getRecents().get(recents.getRecents().size() - 1));
    }
}