package ru.job4j.tracker;

public class EndProgramAction implements UserAction {
    @Override
    public String name() {
        return "End program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Goodbye!");
        return false;
    }
}
