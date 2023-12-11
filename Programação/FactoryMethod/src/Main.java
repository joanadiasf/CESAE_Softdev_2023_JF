import PreFactoryMethod.Enums.TipoCombustivel;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    /**
     * Método criar Veiculo na Consola
     * @return veiculo
     */
    public static Veiculo criarVeiculo(){

        Scanner input = new Scanner(System.in);


        //declarar variaveis
        String marca, modelo;
        int idade, potencia,litros100Km;
        double cilindrada;
        TipoCombustivel combustivel;
        String combustivelString;

        //inputs
        System.out.println();
        System.out.println("* * * * *  N O V O   V E Í C U L O  * * * * *");
        System.out.println();


        System.out.println("* *  M A R C A  * *");
        marca = input.next();

        System.out.println("* *  M O D E L O  * *");
        modelo = input.next();

        System.out.println("* *  I D A D E  * *");
        idade = input.nextInt();

        System.out.println("* *  P O T E N C I A  * *");
        potencia = input.nextInt();

        System.out.println("* *  C I L I N D R A D A  * *");
        cilindrada = input.nextDouble();

        System.out.println("* *  C O N S U M O   P O R   1 0 0 K M  * *");
        litros100Km = input.nextInt();


        System.out.println("* *  T I P O   D E   C O M B U S T I V EL  * *");

        //apresentar todos os tipos de combustivel antes
        for (TipoCombustivel combustivelAtual : TipoCombustivel.values()){

            System.out.println(combustivelAtual);
        }

        //perguntar qual
        System.out.println("Qual o tipo de combustivel? - - - - - - -");
        combustivelString= input.next();
        combustivelString=combustivelString.toUpperCase();

        TipoCombustivel.valueOf(combustivelString);

        return new Veiculo(marca,modelo,idade,potencia,cilindrada,TipoCombustivel.valueOf(combustivelString),litros100Km);
    }


    public static void main(String[] args) throws FileNotFoundException {

    Scanner input = new Scanner(System.in);

    int opcao;

    //apresentar veiculos pre criados
        Carro carro1 = new Carro("Fiat","500",3,200,20.5,TipoCombustivel.DIESEL,5,5);
        Mota mota1 = new Mota("Vespa","Italian",5,300,40.2,TipoCombustivel.GPL,3);
        Camiao camiao1 = new Camiao("Carga","MuitaCarga",6,40,70,TipoCombustivel.GASOLINA,15,100);

        System.out.println();
        System.out.println("* * * * Veículos já existentes: * * * *");
        System.out.println("Carro - - - - - - -");
        carro1.exibirDetalhes();

        System.out.println("\nMota - - - - - - -");
        mota1.exibirDetalhes();

        System.out.println("\nCamião - - - - - - -");
        camiao1.exibirDetalhes();

        //criar um veiculo que vai guardar o que o user vai criar
        Veiculo veiculoUser = criarVeiculo();

        System.out.println("\nO seu veículo - - - - - - -");
        veiculoUser.exibirDetalhes();

    //menu

    do {

        System.out.println();
        System.out.println("* * * * *  M E N U  * * * * *");

        System.out.println("\n1- Criar Veículo a partir da consola");
        System.out.println("2- Calcular Consumo");
        System.out.println("3- Fazer corrida com Carro 1");
        System.out.println("4- Fazer corrida com Mota 1");
        System.out.println("5- Fazer corrida com Camião 1");
        System.out.println("6- Calcular custos do Camião de uma viagem");
        System.out.println("7- Imprimir imagem da Mota");
        System.out.println("8- Sair ");

        System.out.print("\nEscolha opção:");
        opcao= input.nextInt();

        switch (opcao){

            case 1:
                System.out.println("* * * * *  N O V O   V E Í C U L O  * * * * *");

                veiculoUser=criarVeiculo();

            break;

            case 2:

                System.out.println("* * * * *  C A L C U L A R   C O N S U M O  * * * * *");
                System.out.print("\nA viagem é de quantos km? - - - - - - -");
                double km= input.nextDouble();


                System.out.println(veiculoUser.litros(km));

            break;

            case 3:

                System.out.println("* * * * *  C O R R I D A   V S   C A R R O 1  * * * * *");
                System.out.println(veiculoUser.corrida(carro1));


            break;

            case 4:

                System.out.println("* * * * *  C O R R I D A   V S   M O T A 1  * * * * *");
                System.out.println(veiculoUser.corrida(mota1));


            break;

            case 5:

                System.out.println("* * * * *  C O R R I D A   V S   C A M I Ã O 1  * * * * *");
                System.out.println(veiculoUser.corrida(camiao1));


            break;

            case 6:

                System.out.println("* * * * *  C U S T O   V I A G E M   C A M I Ã O  * * * * *");
                System.out.print("\nA viagem é de quantos km? - - - - - - -");
                double kmCamiao = input.nextDouble();

                System.out.print("\nQual a carga da viagem? - - - - - - -");
                double cargaViagem = input.nextDouble();

                camiao1.viagem(kmCamiao,cargaViagem);

            break;

            case 7:

                System.out.println("* * * * *  M O T A  * * * * * ");
                mota1.imprimirMota();

                break;

            default:
                System.out.println("/!/  /!/  /!/  /!/  /!/  /!/  I N V Á L I D O  /!/  /!/  /!/  /!/  /!/  /!/");

        }
    }while (opcao!=8);


    }
}
