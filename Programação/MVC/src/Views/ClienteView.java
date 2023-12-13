package Views;

import java.util.Scanner;

public class ClienteView {


    public static void menuCliente() {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        System.out.println("\n********** M E N U ******************");
        System.out.println("* 1- Consultar Produtos Disponíveis *");
        System.out.println("* 2- Consultar Produtos             *");
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
                    System.out.println("**** Consultar Produtos ****");
                    break;

                case 3:
                    System.out.println("**** Consultar Produto Mais Barato ****");
                    break;

                case 4:
                    System.out.println("**** Consultar Produto Mais Caro ****");
                    break;

                case 0:
                    System.out.println("* * * * * A D E U S * * * * *");
                    break;

            }
        }while (opcao!=0);

    }
}
