package Ex_03;

public class DocumentFactory {

    public static Document criarDocumento (String tipoDoc,String autor,String nome){

        switch (tipoDoc){

            case "texto":
                return new DocTexto(autor, nome);
            case "excel":
                return new DocCalculo(autor, nome);
            case "apresentacao":
                return new DocApresentacao(autor, nome);

            default:
                throw new IllegalArgumentException("Tipo de Documento Inválido");
        }
    }
}
