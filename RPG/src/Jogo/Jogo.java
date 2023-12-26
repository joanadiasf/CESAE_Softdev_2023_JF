package Jogo;

import Entidades.TipoHerois.BarbaroAttackStrategy;
import Entidades.TipoHerois.BardoAttackStrategy;
import Entidades.TipoHerois.FeiticeiroAttackStrategy;
import Entidades.TipoHerois.Herois;
import Jogo.SalasJogo.Sala1_Taberna1;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static Jogo.SalasJogo.CharacterScreen.morte;
import static Jogo.SalasJogo.CharacterScreen.tobias;

public class Jogo {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        //criação personagem + inicio de jogo

        Sala1_Taberna1.sala1_Inicio(personagem());

    }

    public static Herois personagem() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.println("\nBem-vindo a Tobias Quest");
        System.out.println("\n \t \t * * * * * T O B I A S");
        System.out.println("\t \t \t Q U E S T * * * * *");
        tobias();

        //escolher dificuldade

        System.out.println("\n\n\nSelecione a Dificuldade");
        System.out.println("1-Fácil \t 2- Dificil");
        int opcao= input.nextInt();

        //criação personagem
        System.out.println("Vamos criar o seu Heroi!");

        if (opcao==1){       //fácil

            System.out.println("\nComo se chama o Heroi?");
            String nome=input.next();

            System.out.println("\nEscolha a sua classe");
            System.out.println("1- Feiticeiro \t 2- Bardo \t 3- Barbaro");

            int escolha= input.nextInt();


            int pontosVida=0,pontosForca=0,contPontos=3;

            //distribuição de pontos
            while (contPontos != 0){

                System.out.println("\nTem"+ contPontos + "pontos de criação disponiveis...");
                System.out.println("1- Vida \t 2- Força");
                int distribuicaoPontos = input.nextInt();

                switch (distribuicaoPontos){

                    case 1:
                        pontosVida++;
                        System.out.println("Adicionou 1 ponto de vida");
                        break;

                    case 2:
                        pontosForca++;
                        System.out.println("Adicionou 1 ponto de força");
                        break;

                    default:
                        System.out.println("Opção Inválida...");
                }

                contPontos--;
            }

            if (pontosVida==1 && pontosForca==2){

                pontosVida=100;
                pontosForca=20;
            }

            if (pontosVida==2 && pontosForca==1){

                pontosVida=150;
                pontosForca=10;
            }

            if (pontosVida==3 || pontosForca==3){

                System.out.println("O Jogador não sabe criar personagens...");
                morte();
            }

            switch (escolha){


                case 1:
                    return new Herois(nome,pontosVida,pontosForca,1,200, new FeiticeiroAttackStrategy());
                case 2:
                    return new Herois(nome,pontosVida,pontosForca,1,200, new BardoAttackStrategy());

                case 3:
                    return new Herois(nome,pontosVida,pontosForca,1,200, new BarbaroAttackStrategy());


                default:
                    System.out.println("Opção Inválida...");
            }
        }
        if (opcao==2){   //dificil

            System.out.println("\nComo se chama o Heroi?");
            String nome=input.next();

            System.out.println("\nEscolha a sua classe");
            System.out.println("1- Feiticeiro \t 2- Bardo \t 3- Barbaro");

            int escolha= input.nextInt();

            int pontosVida=0,pontosForca=0,contPontos=3;

            while (contPontos != 0){

                System.out.println("\nTem"+ contPontos + "pontos de criação disponiveis...");
                System.out.println("1- Vida \t 2- Força");
                int distribuicaoPontos = input.nextInt();

                switch (distribuicaoPontos){

                    case 1:
                        pontosVida++;
                        System.out.println("Adicionou 1 ponto de vida");
                        break;

                    case 2:
                        pontosForca++;
                        System.out.println("Adicionou 1 ponto de força");
                        break;

                    default:
                        System.out.println("Opção Inválida...");
                }

                contPontos--;
            }

            if (pontosVida==1 && pontosForca==2){

                pontosVida=50;
                pontosForca=10;
            }

            if (pontosVida==2 && pontosForca==1){

                pontosVida=100;
                pontosForca=5;
            }

            if (pontosVida==3 || pontosForca==3){

                System.out.println("O Jogador não sabe criar personagens...");
                morte();
            }

            switch (escolha){


                case 1:
                    return new Herois(nome,pontosVida,pontosForca,1,100, new FeiticeiroAttackStrategy());

                case 2:
                    return new Herois(nome,pontosVida,pontosForca,1,100, new BardoAttackStrategy());

                case 3:
                    return new Herois(nome,pontosVida,pontosForca,1,100, new BarbaroAttackStrategy());
                    

                default:
                    System.out.println("Opção Inválida...");
            }

        }
        return null;
    }
}
