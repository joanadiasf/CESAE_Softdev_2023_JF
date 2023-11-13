package FichaPratica07;

//importar files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {

    //throws FileNotFoundException - é adicionado "automaticamente"
    //serve para caso o programa tentar aceder a ficheiro q nao existe
    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro - o path tem q estar correto
        Scanner fileScanner = new Scanner(new File("FichaJava/Ficheiros/exercicio_04.csv"));

        //String - para poder ler linha de texto
        String linha;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }


    }
}
