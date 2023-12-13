package Views;

import java.util.Scanner;

public class FuncionarioView {

    public void menuStaff() {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("\n********** M E N U ******************");
        System.out.println("* 1- Adicionar nova venda           *");
        System.out.println("* 2- Consultar Stock Produto        *");
        System.out.println("* 0- Sair                           *");
        System.out.println("*************************************");

        System.out.println("\nSelecione uma opção ******");
        opcao = input.nextInt();

        do {
            switch (opcao) {

                case 1:
                    System.out.println("**** Adicionar nova venda ****");
                    break;

                case 2:
                    System.out.println("**** Consultar Stock Produto ****");
                    break;

                case 0:
                    System.out.println("* * * * * A D E U S * * * * *");
                    break;

            }
        }while (opcao!=0);

    }
}
