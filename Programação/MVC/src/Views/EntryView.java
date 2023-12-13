package Views;

import Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntryView {

    public static void menuEntrada() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        LoginController loginController = new LoginController();

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
                String tipoAcesso1="ADMIN";

                System.out.println("\nNome Utilizador: ");
                user= input.next();

                System.out.println("Password: ");
                password= input.next();

                if (loginController.validarLogin(tipoAcesso1,user,password)){
                    FuncionarioView.menuStaff();
                }else {
                    System.out.println("\nAcesso Inválido");
                }

                break;

            case 3: //funcionario
                String tipoAcesso="FUNC";

                System.out.println("\nNome Utilizador: ");
                user= input.next();

                System.out.println("Password: ");
                password= input.next();

                if (loginController.validarLogin(tipoAcesso,user,password)){
                    FuncionarioView.menuStaff();
                }else {
                    System.out.println("\nAcesso Inválido");
                }
                break;



            case 0:
                break;

        }
    }
}
