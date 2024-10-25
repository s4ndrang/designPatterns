package Memento;

public class Document {
    private String content;
    public Document(String content, History history) {
        this.content = content;
        createMemento(history);
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content, History history) {
        this.content = content;
        createMemento(history);
    }
    public void write(String str, History history) {
        this.content += str;
        createMemento(history);
    }
    private DocumentMemento createMemento(History history) {
        DocumentMemento memento = new DocumentMemento(this.content);
        history.addMemento(memento);
        return memento;
    }

    public void restoreMemento(DocumentMemento documentMemento) {
        this.content = documentMemento.getContent();
    }
    public String retrieveMemento(DocumentMemento documentMemento) {
        return documentMemento.getContent();
    }
}
