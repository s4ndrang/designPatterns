package Proxy;

public class Main {
    public static void main(String args[]) {
        ExpensiveObject obj = new ExpensiveObjectProxy("Diamond");
        obj.process();
        obj.process();

        ExpensiveObject anotherObj = new ExpensiveObjectProxy("Ruby");
        anotherObj.process();
        anotherObj.process();

        ExpensiveObject sameObj = new ExpensiveObjectProxy("Diamond");
        sameObj.process();
        sameObj.process();
    }
}
