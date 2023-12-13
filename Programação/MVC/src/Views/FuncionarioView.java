package Views;

import java.util.Scanner;

public class FuncionarioView {

    public void menuStaff() {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\n********** M E N U ******************");
        System.out.println("* 1- Consultar Produtos Disponíveis *");
        System.out.println("* 2- Consultar Produtos             *");
        System.out.println("* 3- Consultar Produto Mais Barato  *");
        System.out.println("* 0- Sair                           *");
        System.out.println("*************************************");

        System.out.println("\nSelecione uma opção ******");
        opcao = input.nextInt();

        do {
            switch (opcao) {

                case 1:
                    System.out.println("****");
                    break;

                case 2:
                    break;

                case 3:
                    break;


                case 0:
                    System.out.println("* * * * * A D E U S * * * * *");
                    break;

            }
        }while (opcao!=0);

    }
}
