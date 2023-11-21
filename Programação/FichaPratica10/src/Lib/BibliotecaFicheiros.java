package Lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFicheiros {

    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
        Scanner fileScanner = new Scanner(new File(caminho));

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }



    }
}
