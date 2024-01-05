package Ex_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Tipo de Documento [texto][excel][apresentacao]");
        String tipo = input.next();

        System.out.println("Autor:");
        String autor = input.next();

        System.out.println("Nome ficheiro:");
        String nomeFicheiro = input.next();

        Document documentUser = DocumentFactory.criarDocumento(tipo,autor,nomeFicheiro);

        documentUser.open();
        documentUser.save();
        documentUser.close();
    }
}
