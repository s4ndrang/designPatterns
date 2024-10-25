package ChainOfCommand;

public class Handler implements IHandler {
    private IHandler nextIHandler;
    private Priority priority;
    public Handler(Priority priority) {
        this.priority = priority;
    }
    @Override
    public void setNextHandler(IHandler nextIHandler) {
        this.nextIHandler = nextIHandler;
    }

    @Override
    public void handle(Request request) {
        if (request.getPriority().equals(this.priority)) {
            System.out.println(this.priority.name() + " handler handles it.");
            return;
        }
        if (this.nextIHandler != null) {
            this.nextIHandler.handle(request);
        } else {
            System.out.println("Request can't be handled.");
        }
    }
}
