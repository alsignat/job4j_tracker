package ru.job4j.tracker;

import org.junit.Test;

import javax.xml.stream.events.StartElement;

import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"0", "Fix PC", "1"};
        Input input = new StubInput(answers);
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out), new EndProgramAction(out)};
        new StartUI(out).init(input, tracker, actions);
        assertEquals(tracker.findAll()[0].getName(), "Fix PC");
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

}
