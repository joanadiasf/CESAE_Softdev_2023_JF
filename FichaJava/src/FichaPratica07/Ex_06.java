package FichaPratica07;


//importar files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Ex_06 {

    public static void main(String[] args) throws FileNotFoundException{


        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_06.txt"));

        //String - para poder ler linha de texto
        String linha,nome,maisVelho="";
        int idade,maior=0;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            String[] itensLinha = linha.split(",");

            nome = itensLinha[0];
            idade = Integer.parseInt(itensLinha[1]);

            if (idade < maior){

                maisVelho=nome;
            }
        }

        System.out.println(maisVelho + "é o(a) mais velho(a).");




    }
}

//ler ficheiro com nomes e idades separados por virgulas
//imprimir o NOME da pessoa mais velha na consola

//NAO DA NADA