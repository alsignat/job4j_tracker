package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class StringCompareTest {

    @Test
    public void compareIfFooAndBar() {
        Comparator<String> comp = new StringCompare();
        int rsl = comp.compare("Foo", "Bar");
        assertTrue(rsl > 0);
    }

    @Test
    public void compareIfBarAndFoo() {
        Comparator<String> comp = new StringCompare();
        int rsl = comp.compare("Bar", "Foo");
        assertTrue(rsl < 0);
    }

    @Test
    public void compareIfFooAndFoo() {
        Comparator<String> comp = new StringCompare();
        int rsl = comp.compare("Foo", "Foo");
        assertEquals(0, rsl);
    }

    @Test
    public void compareIfFooAndFooo() {
        Comparator<String> comp = new StringCompare();
        int rsl = comp.compare("Foo", "Fooo");
        assertTrue(rsl < 0);
    }

}