package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_02 {

    public static void main(String[] args) throws FileNotFoundException {


        //criação novo ficheiro
        File novoFicheiro = new File("Ficheiros/exercicio_02.txt");

        //criar "maquina de escrever"
        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);

        //atribuir mensagem e criar string
        String mensagem = "***** O L Á *****";

        //imprimir e guardar no ficheiro txt
        escritaFicheiro.println(mensagem);

        //close é necessário!!
        escritaFicheiro.close();



    }
}
