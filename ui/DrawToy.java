package test_1_task_3.ui;

public class DrawToy extends Command {
    
     public DrawToy(ConsoleUI consoleUI) {
        super(consoleUI);        
    }

    @Override
    public String getDescription() {
         return "Разыграть игрушку";
    }

    @Override
    public void execute() {
        getConsoleUI().drawToy();
    }

}
