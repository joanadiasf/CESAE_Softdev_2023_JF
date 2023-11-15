package PE_joanaFernandes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static PE_joanaFernandes.funcoes.*;
public class GameStart_JoanaFernandes {

    public static void main(String[] args) throws FileNotFoundException {

        //ler ficheiro + ler input do utilizador
        Scanner fileScanner = new Scanner(new File("src/PE_joanaFernandes/GameStart_V2.csv"));
        Scanner input = new Scanner(System.in);


        String menuAdmClient;

        //espaçamento
        System.out.println();

        System.out.println("*****| BEM - VINDO |*****");


        //menu1 - admin ou client

        do {

            System.out.print("Tipo de Utilizador ( ADMIN || CLIENT): ");
            menuAdmClient = input.next();

            switch (menuAdmClient){

                case "ADMIN":
                    //funçao menu admin
                    System.out.println("admin");
                    break;

                case "CLIENTE":
                    //funçao menu client
                    System.out.println("client");
                    break;

                default:
                    System.out.println("------ Opção inválida... ------");
                    System.out.println("------ Tente novamente ------");
            }
        }while (!menuAdmClient.equals("ADMIN") && !menuAdmClient.equals("CLIENTE"));


    }

}
