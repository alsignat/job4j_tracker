package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Request", 12),
                new Item("New request", 4),
                new Item("One more request", 77)
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("New request", 4),
                new Item("One more request", 77),
                new Item("Request", 12)
        );
        assertEquals(items, expected);
    }
}