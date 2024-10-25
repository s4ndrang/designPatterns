package Memento;

public class Main {
    public static void main(String args[]) {
        History history = new History();

        Document document = new Document("Title ", history);
        document.write("First line. ", history);
        document.write("Second line. ", history);
        document.write("Third line. ", history);
        document.write("The End. ", history);

        for (int i = 0; i < history.getMementos().size(); i++) {
           document.restoreMemento(history.accessMemento(i));
           System.out.println(document.getContent());
        }

        history.undo();

        for (int i = 0; i < history.getMementos().size(); i++) {
            document.restoreMemento(history.accessMemento(i));
            System.out.println(document.getContent());
        }

        System.out.println("Accessing at 2 : ");
        document.restoreMemento(history.accessMemento(2));
        System.out.println(document.getContent());

    }
}
