package ru.job4j.tracker;

public class EndProgramAction implements UserAction {

    private final Output out;

    public EndProgramAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "End program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Goodbye!");
        return false;
    }
}
