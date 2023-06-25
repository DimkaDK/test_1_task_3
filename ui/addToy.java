package test_1_task_3.ui;

public class addToy extends Command{

    public addToy(ConsoleUI consoleUI) {
        super(consoleUI);
    }

    @Override
    public String getDescription() {
        return "Добавить игрушку";
    }

    @Override
    public void execute() {
       getConsoleUI().addToy();
    }
    
}
