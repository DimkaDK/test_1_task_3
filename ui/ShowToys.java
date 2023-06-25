package test_1_task_3.ui;

public class ShowToys extends Command{

    public ShowToys(ConsoleUI consoleUI) {
        super(consoleUI);        
    }

    @Override
    public String getDescription() {
         return "Показать список игрушек";
    }

    @Override
    public void execute() {
        getConsoleUI().showToy();
    }
    
}
