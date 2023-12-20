package Jogo;

import Entidades.TipoHerois.BarbaroAttackStrategy;
import Entidades.TipoHerois.BardoAttackStrategy;
import Entidades.TipoHerois.FeiticeiroAttackStrategy;
import Entidades.TipoHerois.Herois;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {



    }

    public Herois personagem(){

        Scanner input = new Scanner(System.in);

        System.out.println("\nBem-vindo a Tobias Quest");
        //todo add ascii art

        System.out.println("\nSelecione a Dificuldade");
        System.out.println("1-Fácil \t 2- Dificil");
        int opcao= input.nextInt();

        System.out.println("Vamos criar o seu Heroi!");

        if (opcao==1){

            System.out.println("\nComo se chama o Heroi?");
            String nome=input.next();

            System.out.println("\nEscolha a sua classe");
            System.out.println("1- Feiticeiro \t 2- Bardo \t 3- Barbaro");

            int escolha= input.nextInt();


            switch (escolha){


                case 1:
                    Herois feiticeiro = new Herois(nome,100,20,1,200, new FeiticeiroAttackStrategy());
                    return feiticeiro;
                case 2:
                    Herois bardo = new Herois(nome,100,20,1,200, new BardoAttackStrategy());
                    return bardo;

                case 3:
                    Herois barbaro = new Herois(nome,100,20,1,200, new BarbaroAttackStrategy());
                    return barbaro;


                default:
                    System.out.println("Opção Inválida...");
            }
        }
        if (opcao==2){

            System.out.println("\nComo se chama o Heroi?");
            String nome=input.next();

            System.out.println("\nEscolha a sua classe");
            System.out.println("1- Feiticeiro \t 2- Bardo \t 3- Barbaro");

            int escolha= input.nextInt();


            switch (escolha){


                case 1:
                    Herois feiticeiro = new Herois(nome,100,10,1,100, new FeiticeiroAttackStrategy());
                    return feiticeiro;

                case 2:
                    Herois bardo = new Herois(nome,100,10,1,100, new BardoAttackStrategy());
                    return bardo;

                case 3:
                    Herois barbaro = new Herois(nome,100,10,1,100, new BarbaroAttackStrategy());
                    return barbaro;
                    

                default:
                    System.out.println("Opção Inválida...");
            }

        }
        return null;
    }
}
