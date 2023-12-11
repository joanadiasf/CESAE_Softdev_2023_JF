package Ex_03;

import Ex_03.Enum.DocumentType;

public class DocCalculo extends Document{

    public DocCalculo(String autor, String nome) {
        super(autor, nome, DocumentType.FOLHA_CALCULO);
    }

    @Override
    public void open() {
        System.out.println("A abrir o documento de " + super.getTipoDoc()+ " " + super.getNome() + ".xlxs");
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
