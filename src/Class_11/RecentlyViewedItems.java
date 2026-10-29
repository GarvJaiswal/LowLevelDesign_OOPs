package Class_11;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private final LinkedList<Item> recents;
    private static final int MAX_SIZE = 10;

    public RecentlyViewedItems() {
        this.recents = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        // Remove item if already present so it can be moved to front
        recents.remove(item);

        recents.addFirst(item);
        if (recents.size() > MAX_SIZE) {
            recents.removeLast();
        }
    }

    public List<Item> getRecents() {
        return Collections.unmodifiableList(recents);
    }

    @Override
    public String toString() {
        return "RecentlyViewedItems{" +
                "recents=" + recents +
                '}';
    }
}