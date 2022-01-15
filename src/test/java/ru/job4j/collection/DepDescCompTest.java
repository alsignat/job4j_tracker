package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertTrue(rsl > 0);
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertTrue(rsl < 0);
    }

    @Test
    public void whenFirstDepartmentIsEqualThenAsc() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        assertTrue(rsl < 0);
    }

    @Test
    public void whenFirstDepartmentIsDifferentThenDesc() {
        int rsl = new DepDescComp().compare(
                "K1/SK1/SSK1",
                "K2/SK1"
        );
        assertTrue(rsl > 0);
    }
}