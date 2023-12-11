package Ex_03;

import Ex_03.Enum.DocumentType;

public class DocApresentacao extends Document{

    public DocApresentacao(String autor, String nome) {
        super(autor, nome, DocumentType.APRESENTACAO);
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de " + super.getTipoDoc() + " " + super.getNome() + ".pptx");

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
