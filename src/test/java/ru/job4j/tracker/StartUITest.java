package ru.job4j.tracker;

import org.junit.Test;

import javax.xml.stream.events.StartElement;

import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertEquals(expected.getName(), created.getName());
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), /* id сохраненной заявки в объект tracker. */
                "edited item"
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertEquals(edited.getName(), "edited item");
    }

    @Test
    public void deleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        int deletedItemId = tracker.findAll()[0].getId();
        boolean testBooleanReturn = tracker.delete(deletedItemId);
        boolean testTrackerUpdated = tracker.findById(deletedItemId) == null;
        assertTrue(testBooleanReturn && testTrackerUpdated);
    }
}
