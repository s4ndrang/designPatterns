package Proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObjectImpl expensiveObjectImpl;
    private String name;
    public ExpensiveObjectProxy(String name) {
        this.name = name;
    }
    @Override
    public void process() {
        if (expensiveObjectImpl == null) {
            expensiveObjectImpl = new ExpensiveObjectImpl(this.name);
        }
        expensiveObjectImpl.setName(this.name);
        expensiveObjectImpl.process();
    }
}
