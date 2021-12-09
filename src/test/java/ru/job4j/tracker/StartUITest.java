package ru.job4j.tracker;

import org.junit.Test;

import javax.xml.stream.events.StartElement;

import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        Item item = new Item("new item");
        String[] answers = {"0", String.valueOf(item.getName()), "1"};
        Input input = new StubInput(answers);
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out), new EndProgramAction(out)};
        new StartUI(out).init(input, tracker, actions);
        assertEquals(tracker.findAll()[0].getName(), "new item");
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        Output out = new StubOutput();
        tracker.add(item);
        UserAction[] actions = {new EditAction(out), new EndProgramAction(out)};
        String[] answers = {"0", String.valueOf(item.getId()), "edited item", "1"};
        Input input = new StubInput(answers);
        new StartUI(out).init(input, tracker, actions);
        assertEquals(tracker.findById(item.getId()).getName(), "edited item");
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {"0", "1", "1"};
        Input input = new StubInput(answers);
        Output out = new StubOutput();
        UserAction[] actions = {new DeleteAction(out), new EndProgramAction(out)};
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
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new EditAction(out),
                new EndProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals("\nMenu:" + ln
                        + "0. Edit item" + ln
                        + "1. End program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "\nMenu:" + ln
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
                new String[] {"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByIdAction(out),
                new EndProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals("\nMenu:" + ln
                        + "0. Find item by id" + ln
                        + "1. End program" + ln
                        + "=== Find item by id ===" + ln
                        + one.toString() + ln
                        + "\nMenu:" + ln
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
                new String[] {"0", one.getName(), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByNameAction(out),
                new EndProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals("\nMenu:" + ln
                        + "0. Find items by name" + ln
                        + "1. End program" + ln
                        + "=== Find items by name ===" + ln
                        + tracker.findByName(one.getName())[0].toString() + ln
                        + "\nMenu:" + ln
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
                new String[] {"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowItemsAction(out),
                new EndProgramAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertEquals(out.toString(),
                "\nMenu:" + ln
                        + "0. Show all items" + ln
                        + "1. End program" + ln
                        + "=== Show all items ===" + ln
                        + one.toString() + ln
                        + "\nMenu:" + ln
                        + "0. Show all items" + ln
                        + "1. End program" + ln
                        + "Goodbye!" + ln
        );
    }
}
