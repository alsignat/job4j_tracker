package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Request", 12),
                new Item("New request", 4),
                new Item("One more request", 77)
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Request", 12),
            new Item("One more request", 77),
                new Item("New request", 4)
        );
        assertEquals(items, expected);
    }
}