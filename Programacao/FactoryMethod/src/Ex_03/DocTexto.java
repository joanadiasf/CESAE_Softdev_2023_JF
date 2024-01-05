package Ex_03;

import Ex_03.Enum.DocumentType;

public class DocTexto extends Document{

    public DocTexto(String autor, String nome) {
        super(autor, nome, DocumentType.TEXTO);
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de " + super.getTipoDoc()+ " " + super.getNome() + ".docx");
    }

    @Override
    public void save() {
        System.out.println("Alterações do " + super.getNome()+ " " + "gravadas");
    }

    @Override
    public void close() {
        System.out.println("A fechar o documento de " + super.getTipoDoc());
    }
}
