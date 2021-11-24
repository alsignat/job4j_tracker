package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new EndProgramAction(),
                new CreateAction(),
                new ShowItemsAction(),
                new EditAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
        };
        new StartUI().init(input, tracker, actions);
    }

    private void showMenu(UserAction[] actions) {
        System.out.print(System.lineSeparator());
        System.out.println("Menu.");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }
}
