package Memento;

public class DocumentMemento {
    private String content;
    public DocumentMemento(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
}
