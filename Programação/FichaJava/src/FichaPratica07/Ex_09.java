package FichaPratica07;

//importar files

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Ex_09 {

    public static void main(String[] args) throws FileNotFoundException {

        //ler ficheiro
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_09.txt"));

        //1variavel - contar palavras totais | 2variavel - pra nao perder a posicao da linha anterior
        //3variavel - para comparar com uma variavel criada à frente | 1string - guardar a palavra repetida
        int contaPalavras=0,cont=0,rep=0;
        String palavraRep="";


        //ler o ficheiro e contar o nr de palavras
        while (fileScanner.hasNextLine()){
           String linha = fileScanner.nextLine();

           String[] palavras = linha.split(" ");

           contaPalavras+=palavras.length;


        }


        //fechar o ficheiro para o scanner voltar ao inicio
        fileScanner.close();

        //voltar a abrir o ficheiro
        Scanner fileScanner2 = new Scanner(new File("FichaJava/Ficheiros/exercicio_09.txt"));


        //criar vetor grande para dividir as palavras por elementos do vetor
        String [] grandeVetor = new String[contaPalavras];


        //preencher vetor
        while (fileScanner2.hasNextLine()){
           String linha = fileScanner2.nextLine();
            String[] palavras = linha.split(" ");

            for (int i =0; i < palavras.length;i++){

                grandeVetor[cont] = palavras[i];
                cont+=1;
            }

        }

        //l vai procurar palavra repetida em c
        for (int l=0; l < grandeVetor.length;l++ ){

            //vai contar sempre que a palavra for igual
            int contagemAtual=0;

            for (int c=0;c < grandeVetor.length;c++){

                //sempre que a palavra repetir
                if (grandeVetor[l].equals(grandeVetor[c])){

                    contagemAtual++;
                }

            }

            //para guardar a palavra mais repetida
            if (contagemAtual > rep){

                rep=contagemAtual;
                palavraRep=grandeVetor[l];

            }

        }

        //print
        System.out.println("A palavra mais repetida é: " + palavraRep);


    }
}

//ler ficheiro
//imprimir palavra mais frequente


//1 contar nr palavras
//2criar vetor c este tamanho
//3pegar numa linha
//4limpar a linha
//5split
//6passar cada posição para o vetor
//voltar passo 3

//7 analisar vetor grande

//contador pra nao perder a posicao da linha anterior