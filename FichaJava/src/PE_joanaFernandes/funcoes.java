package PE_joanaFernandes;

import java.util.Scanner;

public class funcoes {

    public static void menuAdmin(){


    }

    public static void menuClient(){

        Scanner input = new Scanner(System.in);

        int opcao,contactoCLiente;
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

            switch (opcao){

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

                    for (int i=1; i*(i+1)*(1+2) < 121;i++){

                        if (i%5==0){

                        }
                    }



            }

        }while (opcao != 6);
    }
}
