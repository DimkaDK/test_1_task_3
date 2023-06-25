package test_1_task_3.ui;

public abstract class Command {
    private ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI){
        this.consoleUI = consoleUI;
    }

    public abstract String getDescription();

    public ConsoleUI getConsoleUI(){
        return consoleUI;
    }

    public abstract void execute();
}
