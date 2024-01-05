package Ex_03;

import Ex_03.Enum.DocumentType;

public abstract class Document {

    private String autor;
    private String nome;
    private DocumentType tipoDoc;

    public Document(String autor, String nome, DocumentType tipoDoc) {
        this.autor = autor;
        this.nome = nome;
        this.tipoDoc = tipoDoc;
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public DocumentType getTipoDoc() {
        return tipoDoc;
    }

    public abstract void open();
    public abstract void save();
    public abstract void close();
}
