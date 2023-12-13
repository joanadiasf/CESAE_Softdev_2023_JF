package Views;

import java.util.Scanner;

public class EntryView {

    public static void menuEntrada(){

        Scanner input = new Scanner(System.in);
        int opcao=0;

        System.out.println("\n********** M E N U ******************");
        System.out.println("* 1- Cliente                        *");
        System.out.println("* 2- Administrador                  *");
        System.out.println("* 3- Funcionário                    *");
        System.out.println("* 0- Sair                           *");
        System.out.println("*************************************");

        System.out.println("\nSelecione uma opção ******");
        opcao = input.nextInt();


        switch (opcao){

            case 1:
                ClienteView.menuCliente();
                break;

            case 2:
                break;

            case 3:
                break;



            case 0:
                break;

        }
    }
}
