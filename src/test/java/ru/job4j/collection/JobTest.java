package ru.job4j.collection;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Comparator;

public class JobTest {

    @Test
    public void sortedByNameAsc() {
        Comparator<Job> comp = new JobAscByName();
        int rsl = comp.compare(new Job("Foo", 2),
                new Job("Bar", 3));
        assertTrue(rsl > 0);
    }

    @Test
    public void sortedByNameDesc() {
        Comparator<Job> comp = new JobDescByName();
        int rsl = comp.compare(new Job("Foo", 2),
                new Job("Bar", 1));
        assertTrue(rsl < 0);
    }

    @Test
    public void sortedByPriorityAsc() {
        Comparator<Job> comp = new JobAscByPriority();
        int rsl = comp.compare(new Job("Foo", 1),
                new Job("Bar", 5));
        assertTrue(rsl < 0);
    }

    @Test
    public void sortedByPriorityDesc() {
            Comparator<Job> comp = new JobDescByPriority();
            int rsl = comp.compare(new Job("Foo", 1),
                    new Job("Bar", 5));
            assertTrue(rsl > 0);
    }

    @Test
    public void sortedByNameAscAndByPriorityDesc() {
        Comparator<Job> comp = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = comp.compare(new Job("Foo", 10),
                new Job("Foo", 15));
        assertTrue(rsl > 0);
    }

    @Test
    public void sortedByPriorityAscAndByNameDesc() {
        Comparator<Job> comp = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = comp.compare(new Job("Foo", 10),
                new Job("Foo", 5));
        assertTrue(rsl > 0);
    }
}