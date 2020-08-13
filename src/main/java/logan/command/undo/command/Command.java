package logan.command.undo.command;

public interface Command {
    void execute();

    void undo();
}
