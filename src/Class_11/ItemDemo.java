package Class_11;

import Class_11.Book;
import Class_11.Clothing;
import Class_11.Electronic;
import Class_11.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemDemo {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();

        items.add(new Electronic("E101", "Laptop", 75000, 10, 2));
        items.add(new Electronic("E102", "Headphones", 2500, 20, 1));

        items.add(new Clothing("C101", "T-Shirt", 799, 50, "M"));
        items.add(new Clothing("C102", "Jeans", 1999, 30, "L"));

        items.add(new Book("B101", "Clean Code", 599, 15, "Robert C. Martin"));
        items.add(new Book("B102", "Atomic Habits", 450, 25, "James Clear"));

        Collections.sort(items);

        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}