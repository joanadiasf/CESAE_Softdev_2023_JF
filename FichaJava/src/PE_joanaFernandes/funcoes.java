package PE_joanaFernandes;

import java.util.Scanner;

public class funcoes {

    public static void menuAdmin() {


    }

    public static void menuClient() {

        Scanner input = new Scanner(System.in);

        int opcao, contactoCLiente;
        String nomeCliente, emailCliente;

        //menu
        do {

            System.out.println("*****| M E N U |*****");

            System.out.println("1. Inserir cliente.");
            System.out.println("2. Procurar por estacionamento.");
            System.out.println("3. Ver títulos de jogos disponíveis.");
            System.out.println("4. Pesquisa por editora.");
            System.out.println("5. Sair.");

            System.out.println();
            System.out.print("O que pretende fazer?");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    //espaçamento
                    System.out.println();

                    System.out.println("*****| R E G I S T O |*****");

                    System.out.print("Insira o seu nome:");
                    nomeCliente = input.next();

                    System.out.print("Insira o seu contacto:");
                    contactoCLiente = input.nextInt();

                    System.out.println("Insira o seu e-mail:");
                    emailCliente = input.next();

                    System.out.println("------ Registado com sucesso!! ------");
                    System.out.println(nomeCliente + " | " + contactoCLiente + " | " + emailCliente);

                break;

                case 2:

                    //espaçamento
                    System.out.println();

                    //definir o limite de lugares de estacionamento || o indice do ciclo for || a formula do nr triangular
                    int limite = 121, i = 1, numTri = i * (i + 1) * (1 + 2);

                    for (i = 1; numTri < limite; i++) {

                        //ver e imprimir apenas os múltiplos de 5
                        if (numTri % 5 == 0) {

                            System.out.print("Os lugares de estacionamento livres são: " + numTri);
                        }
                    }

                break;

                case 3:
                    //imprimir todos os jogos (sem duplicados)
                break;

                case 4:
                    //user dá editora, print todos os jogos e categorias
                break;

            }

        } while (opcao != 6);
    }
}
