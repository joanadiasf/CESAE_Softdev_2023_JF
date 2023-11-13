package FichaPratica07;

//importar files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Ex_05 {



    public static void main(String[] args) throws FileNotFoundException{

        
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_05_31.txt"));

        //String - para poder ler linha de texto
        String linha;

        //variavel p/ fazer soma
        int total=0;

            //linha p "ler" ficheiro
            linha = fileScanner.nextLine();

            //string "vetor"
            String[] itensLinha = linha.split(" ");

        //ler "vetor" e transformar string em int
        for (int i=0; i < itensLinha.length;i++){

            total+= Integer.parseInt(itensLinha[i]);

        }

        //print
        System.out.println(total);

    }
}


//String[] itensDaLinha = linha.split(" ");

//leia ficheiro c/ nr inteiros separado por espaços e calcule a soma