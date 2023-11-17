package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_03 {


    public static void main(String[] args) throws FileNotFoundException {


        //scanner de ficheiro - o path tem q estar correto
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_03.txt"));



        //criação novo ficheiro
        File novoFicheiro = new File("FichaJava/Ficheiros/exercicio_03Arquivo.txt");

        //criar "maquina de escrever"
        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);


        //String - para poder ler linha de texto
        String linha;


        //enquanto o ficheiro tiver mais linhas ele vai imprimir
        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();

            //imprimir e guardar no novo ficheiro txt
            escritaFicheiro.println(linha);
        }


        //close é necessário!!
        escritaFicheiro.close();


    }
}
