package ChainOfCommand;

public interface IHandler {
    void setNextHandler(IHandler nextIHandler);
    void handle(Request request);
}
