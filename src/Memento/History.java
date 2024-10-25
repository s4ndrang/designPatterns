package Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMemento> mementos;
    public History() {
        this.mementos = new ArrayList<>();
    }
    public List<DocumentMemento> getMementos() {
        return this.mementos;
    }
    public void addMemento(DocumentMemento memento) {
        mementos.add(memento);
    }
    public DocumentMemento accessMemento(int index) {
        return mementos.get(index);
    }
    public void undo() {
        mementos.remove(mementos.size()-1);
    }
}
