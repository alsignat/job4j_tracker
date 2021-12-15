package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        Item item = new Item("new item");
        List<String> answers = List.of("0", item.getName(), "1");
        Input input = new StubInput(answers);
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(new CreateAction(out), new EndProgramAction(out));
        new StartUI(out).init(input, tracker, actions);
        assertEquals(tracker.findAll().get(0).getName(), "new item");
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        Output out = new StubOutput();
        tracker.add(item);
        List<UserAction> actions = List.of(new EditAction(out), new EndProgramAction(out));
        List<String> answers = List.of("0", String.valueOf(item.getId()), "edited item", "1");
        Input input = new StubInput(answers);
        new StartUI(out).init(input, tracker, actions);
        assertEquals(tracker.findById(item.getId()).getName(), "edited item");
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        List<String> answers = List.of("0", String.valueOf(item.getId()), "1");
        Input input = new StubInput(answers);
        Output out = new StubOutput();
        List<UserAction> actions = List.of(new DeleteAction(out), new EndProgramAction(out));
        new StartUI(out).init(input, tracker, actions);
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                List.of("0", String.valueOf(one.getId()), replaceName, "1")
        );
        List<UserAction> actions = List.of(
                new EditAction(out),
                new EndProgramAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals("Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. End program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. End program" + ln
                        + "Goodbye!" + ln,
                out.toString());
    }

    @Test
    public void whenFindByIdTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                List.of("0", String.valueOf(one.getId()), "1")
        );
        List<UserAction> actions = List.of(
                new FindByIdAction(out),
                new EndProgramAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals("Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. End program" + ln
                        + "=== Find item by id ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. End program" + ln
                        + "Goodbye!" + ln,
                out.toString());
    }

    @Test
    public void whenFindByNameTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                List.of("0", one.getName(), "1")
        );
        List<UserAction> actions = List.of(
                new FindByNameAction(out),
                new EndProgramAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals("Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. End program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. End program" + ln
                        + "Goodbye!" + ln,
                out.toString());
    }

    @Test
    public void whenFindAllTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                List.of("0", String.valueOf(one.getId()), "1")
        );
        List<UserAction> actions = List.of(
                new ShowItemsAction(out),
                new EndProgramAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. End program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. End program" + ln
                        + "Goodbye!" + ln
        );
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                List.of("10", "0")
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new EndProgramAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "Menu:" + ln
                    + "0. End program" + ln
                    + "Wrong input, you can select: 0 .. 0" + ln
                    + "Menu:" + ln
                    + "0. End program" + ln
                    + "Goodbye!" + ln
        );
    }

}
