package Views;

import Controllers.ClientController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClienteView {


    public static void menuCliente() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        ClientController clientController = new ClientController();

        int opcao = 0;

        System.out.println("\n********** M E N U ******************");
        System.out.println("* 1- Consultar Produtos Disponíveis *");
        System.out.println("* 2- Consultar Produtos de Categoria*");
        System.out.println("* 3- Consultar Produto Mais Barato  *");
        System.out.println("* 4- Consultar Produto Mais Caro    *");
        System.out.println("* 0- Sair                           *");
        System.out.println("*************************************");

        System.out.println("\nSelecione uma opção ******");
        opcao = input.nextInt();

        do {
            switch (opcao) {

                case 1:
                    System.out.println("**** Consultar Produtos Disponíveis ****");
                    break;

                case 2:
                    System.out.println("**** Consultar Produtos de Categoria ****");
                    break;

                case 3:
                    System.out.println("**** Consultar Produto Mais Barato ****");
                    break;

                case 4:
                    System.out.println("**** Consultar Produto Mais Caro ****");
                    clientController.produtoMaisCaro().exibirDetalhes();
                    break;

                case 0:
                    System.out.println("* * * * * A D E U S * * * * *");
                    break;

            }
        }while (opcao!=0);

    }
}
