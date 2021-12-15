package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(List.of("one", "1"));
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertEquals(selected, 1);
    }

    @Test
    public void whenCorrectInputOnce() {
        Output out = new StubOutput();
        Input in = new StubInput(List.of("2"));
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertEquals(selected, 2);
    }

    @Test
    public void whenCorrectInputTwice() {
        Output out = new StubOutput();
        Input in = new StubInput(List.of("2", "3"));
        ValidateInput input = new ValidateInput(out, in);
        List<Integer> selected = List.of(input.askInt("Enter menu:"), input.askInt("Enter menu:"));
        List<Integer> expected = List.of(2, 3);
        assertEquals(selected, expected);
    }

    @Test
    public void whenInvalidNumber() {
        Output out = new StubOutput();
        Input in = new StubInput(List.of("-1"));
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertEquals(selected, -1);
    }
}