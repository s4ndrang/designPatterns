package ChainOfCommand;

public class Main {
    public static void main(String args[]) {
        Handler basicHandler = new HandlerBasic(Priority.BASIC);
        HandlerIntermediate intermediateHandler = new HandlerIntermediate(Priority.INTERMEDIATE);
        HandlerAdvanced advancedHandler = new HandlerAdvanced(Priority.ADVANCED);

        basicHandler.setNextHandler(intermediateHandler);
        intermediateHandler.setNextHandler(advancedHandler);

        Request basicRequest = new Request(Priority.BASIC);
        Request intermediateRequest = new Request(Priority.INTERMEDIATE);
        Request criticalRequest = new Request(Priority.ADVANCED);
        Request overTheTopRequest = new Request(Priority.OVERTHETOP);


        basicHandler.handle(basicRequest);
        basicHandler.handle(intermediateRequest);
        basicHandler.handle(criticalRequest);
        basicHandler.handle(overTheTopRequest);

    }
}
