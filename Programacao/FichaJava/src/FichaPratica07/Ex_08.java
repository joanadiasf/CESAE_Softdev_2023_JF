package FichaPratica07;

//importar files

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex_08 {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_08.txt"));

        //ler ficheiro
        String linha;

        //pesquisa de palavra ********************
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a palavra que quer pesquisar no ficheiro?");
        String palavra=input.next();


        //criação novo ficheiro + maquina ********************
        File novoFicheiro = new File("FichaJava/Ficheiros/exercicio_08_rewrite.txt");

        PrintWriter escritaFicheiro = new PrintWriter(novoFicheiro);


        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();

            //substituir , e . por nada para não dar erro e ler a palavra toda
            linha=linha.replace(",","");
            linha=linha.replace(".","");


            String[] copia = linha.split(" ");
//            System.out.println(linha);

            for (int i=0; i < copia.length;i++){

                if (palavra.equals(copia[i])){
                    escritaFicheiro.println(linha);
                }
            }
        }

        //********** close é necessário!! **********
        escritaFicheiro.close();

    }
}

//ler ficheiro
//gravar APENAS as linhas que contêm uma palavra específica noutro ficheiro