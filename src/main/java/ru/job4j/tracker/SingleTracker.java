package ru.job4j.tracker;

import java.util.List;

public final class SingleTracker {

    private static SingleTracker tracker;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (tracker == null) {
            tracker = new SingleTracker();
        }
        return tracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public List<Item> findByName(String name) {
        return tracker.findByName(name);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }
}
