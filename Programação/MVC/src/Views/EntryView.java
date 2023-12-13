package Views;

import java.util.Scanner;

public class EntryView {

    public static void menuEntrada(){

        Scanner input = new Scanner(System.in);
        int opcao=0;
        String user, password;

        System.out.println("\n********** M E N U ******************");
        System.out.println("* 1- Cliente                        *");
        System.out.println("* 2- Administrador                  *");
        System.out.println("* 3- Funcionário                    *");
        System.out.println("* 0- Sair                           *");
        System.out.println("*************************************");

        System.out.println("\nSelecione uma opção ******");
        opcao = input.nextInt();


        switch (opcao){

            case 1: //cliente
                ClienteView.menuCliente();
                break;

            case 2: //admin
                break;

            case 3: //funcionario
                System.out.println("\nNome Utilizador: ");
                user= input.next();

                System.out.println("Password: ");
                password= input.next();

                if (passwordcorreta){
                    FuncionarioView.menuStaff();
                }
                break;



            case 0:
                break;

        }
    }
}
