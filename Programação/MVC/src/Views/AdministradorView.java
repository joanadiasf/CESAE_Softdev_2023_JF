package Views;

import java.util.Scanner;

public class AdministradorView {

    public void menuAdmni(){

        Scanner input = new Scanner(System.in);
        int opcao=0;

        System.out.println("\n********** M E N U ******************");
        System.out.println("* 1- Analisar Produto mais Vendido  *");
        System.out.println("* 2- Produto com maior valor de vendas             *");
        System.out.println("* 3- Consultar Venda de mais Unidades  *");
        System.out.println("* 4- Consultar Venda mais Valor    *");
        System.out.println("* 5- Obter Total de todas as Vendas    *");
        System.out.println("* 6- Obter média de todas as Vendas    *");
        System.out.println("* 0- Sair                           *");
        System.out.println("*************************************");

        System.out.println("\nSelecione uma opção ******");
        opcao = input.nextInt();

        switch (opcao){

            case 1:
                System.out.println("");
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 0:
                break;

        }
    }
}
