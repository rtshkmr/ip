package duke.task;

public class ToDo extends Task {
    public ToDo(String description) {
        super(description);
    }
    
    @Override
    public boolean isComplete() {
        return super.isComplete();
    }
    
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}