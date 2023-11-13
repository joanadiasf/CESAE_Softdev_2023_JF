package FichaPratica07;


//importar files
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) throws FileNotFoundException {

        //scanner de ficheiro
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_01.txt"));

        //String
        String linha;

        while (fileScanner.hasNextLine()){
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }


        //criar biblioteca de ficheiro
        //imprimirFicheiro (caminho)
    }
}
