package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertEquals(it.next(), new User("Ivan", 31));
        assertEquals(it.next(), new User("Petr", 32));
    }

    @Test
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertTrue(rsl > 0);
    }

    @Test
    public void whenEqualNames() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        users.add(new User("Petr", 30));
        Iterator<User> it = users.iterator();
        assertEquals(it.next(), new User("Ivan", 31));
        assertEquals(it.next(), new User("Petr", 30));
        assertEquals(it.next(), new User("Petr", 32));
    }
}