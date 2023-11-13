package FichaPratica07;

//importar files

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_08 {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_08.txt"));

        //ler ficheiro
        String linha;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            System.out.println(linha);

        }


    }
}

//ler ficheiro
//gravar APENAS as linhas que contêm uma palavra específica noutro ficheiro