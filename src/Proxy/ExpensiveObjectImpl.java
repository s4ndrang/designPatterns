package Proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {
    private String name;

    public ExpensiveObjectImpl(String name) {
        this.name = name;
        createProcessor();
    }
    @Override
    public void process() {
        System.out.println("Processing " + this.name + " : Logging, adding security controls, caching...");
    }

    private void createProcessor() {
        System.out.println("Creating processor for " + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
