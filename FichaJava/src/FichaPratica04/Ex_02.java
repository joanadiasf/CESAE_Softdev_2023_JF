package FichaPratica04;

import java.util.Scanner;
public class Ex_02 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int escolha;

        //Condicional + Loop
        System.out.println("\n Menu: \n 1.Criar 2.Atualizar 3.Eliminar 4.Sair");
        escolha = input.nextInt();

        do {



             switch (escolha){

                 case 1:
                System.out.println("Selecionou a opção 1. Criar.");
                break;

                 case 2:
                System.out.println("Selecionou a opção 2. Atualizar.");
                break;

                 case 3:
                System.out.println("Selecionou a opção 3.Eliminar.");
                break;

                case 4:
                System.out.println("          ");
                break;

                default:
                System.out.println("Opção inválida");

        }

        }while (escolha != 4);
    }
}
// FUNCIONA MAS O LOOP NÃO PARA