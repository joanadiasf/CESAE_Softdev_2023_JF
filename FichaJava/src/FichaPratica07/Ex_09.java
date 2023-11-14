package FichaPratica07;

//importar files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Ex_09 {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro - o path tem q estar correto
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_09.txt"));

        //String - para poder ler linha de texto
        String linha;

        //ler palavra especifica no texto
        String palavraRepetida;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }

    }
}

//ler ficheiro
//imprimir palavra mais frequente