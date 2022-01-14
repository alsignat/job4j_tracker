package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertEquals(result, expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = Diapason.diapason(1, 4, x -> x * x + 5);
        List<Double> expected = Arrays.asList(6D, 9D, 14D);
        assertEquals(result, expected);
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = Diapason.diapason(2, 5, x -> Math.pow(2, x) + 1);
        List<Double> expected = Arrays.asList(5D, 9D, 17D);
        assertEquals(result, expected);
    }
}