package test_1_task_3.ui;

public class Finish extends Command{

    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);        
    }

    @Override
    public String getDescription() {
         return "Завершение работы";
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
    
}
