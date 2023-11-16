package PE_joanaFernandes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoes {

    /**
     * Método para verificar se a palavra-passe está correta e se não ultrapassa as 3 tentativas
     * @return - se a palavra passe for correta ele segue, senão o programa para
     */
    public static boolean password(){

        Scanner input = new Scanner(System.in);


        String password, passwordTentativa;
        password = "123456789";

        int contador=0;

        boolean entrou=true;

        System.out.print("Introduza a palavra-passe:");
        passwordTentativa = input.next();


            if (passwordTentativa.equals(password)){

                System.out.println("***| B E M - V I N D O  A D M I N|***");
                entrou=true;

            }
            while (!passwordTentativa.equals(password) && contador <2){
                System.out.println("/!/ Palavra-passe incorreta... /!/");
                contador++;

                System.out.println();
                System.out.println("------ Tente novamente... ------");

                System.out.println();
                System.out.print("Introduza a palavra-passe:");
                passwordTentativa = input.next();

                //para caso o utilizador acerte entretanto
                if (passwordTentativa.equals(password)){

                    System.out.println("***| B E M - V I N D O  A D M I N|***");


                }
            }

            if (contador >=3){

                System.out.println("/!/ NÚMERO DE TENTATIVAS ESGOTADAS /!/");
                entrou=false;
            }


            return true;
    }

    /**
     * Transforma o ficheiro CSV numa matriz
     * @throws FileNotFoundException
     */
    public static void fileEmMatriz() throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("FichaJava/src/PE_joanaFernandes/GameStart_V2.csv"));

        int i=0;

        //linha cabeçalho;
        String linha= fileScanner.nextLine();

        //declarar matriz
        String[][] matriz = new String[125][9];

        //ler ficheiro e transformar em matriz
        while (fileScanner.hasNextLine() ){
            linha = fileScanner.nextLine();

            //as "colunas" são divididas por , então: split
            String[] divisor = linha.split(";");


            for (int c = 0; c < 9 && c < divisor.length; c++) {

                matriz[i][c] = divisor[c];
            }

            i++;

        }

        //para apresentar a matriz

//        String strg = "";
//
//        //pra ler matriz e por nrs seguidos
//        for (int l=0; l <matriz.length; l++){
//            for (int c =0; c <matriz[0].length; c++){
//
//                strg += matriz[l][c] + "\t";
//            }
//            strg += "\n";
//        }
//
//        //imprimir FORA do for para so aparecer o que se quer
//        System.out.println("\n");
//        System.out.println(strg);

        fileScanner.close();

    }

    /**
     * Menu do Administrador
     * @param escolha - input necessário p/ função trabalhar
     */
    public static void menuAdmin(String escolha) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File("FichaJava/src/PE_joanaFernandes/GameStart_V2.csv"));
        Scanner input = new Scanner(System.in);

        int opcao;

        //***** NÃO ESQUECER *****
        //FAZER CICLO PRA PALAVRA PASSE E LOGIN


//"menu"
        do {
            System.out.println("*****| M E N U |*****");
            System.out.println("1. Conteúdo CSV  - print.");
            System.out.println("2. Ver total de vendas e valor total.");
            System.out.println("3. Total de Lucro.");
            System.out.println("4. Pesquisar cliente por ID.");
            System.out.println("5. Ver o BestSeller.");
            System.out.println("6. Sair.");

            System.out.println();
            System.out.print("Escolha a opção:");
            opcao= input.nextInt();

            //menu
            switch (opcao){

                case 1:
                        //ler csv file
                    fileEmMatriz();

                break;

                case 2:
                    //quantas vendas foram executadas e valor total
                break;

                case 3:
                    //total de lucro - 20% de cada jogo
                break;

                case 4:
                    //pesquisa idcliente - tem nome contacto e email
                break;

                case 5:
                    //print jogo mais caro e quem o comprou(todos os cliente)
                break;

                case 6:
                    System.out.println("****** | A D E U S | ******");
                break;

                default:
                    System.out.println("------ Opção inválida... ------");
                    System.out.println("------ Tente novamente ------");
            }

        }while (opcao !=6);

    }

    /**
     * Menu do Cliente
     * @param escolha - input necessário p/ função trabalhar
     */
    public static void menuClient(int escolha) {

        Scanner input = new Scanner(System.in);

        int opcao, contactoCLiente;
        String nomeCliente, emailCliente;

        //menu
        do {

            System.out.println("*****| M E N U |*****");

            System.out.println("1. Inserir cliente.");
            System.out.println("2. Procurar por estacionamento.");
            System.out.println("3. Ver títulos de jogos disponíveis.");
            System.out.println("4. Pesquisa por editora.");
            System.out.println("5. Sair.");

            System.out.println();
            System.out.print("O que pretende fazer?");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    //espaçamento
                    System.out.println();

                    System.out.println("*****| R E G I S T O |*****");

                    System.out.print("Insira o seu nome:");
                    nomeCliente = input.next();

                    System.out.print("Insira o seu contacto:");
                    contactoCLiente = input.nextInt();

                    System.out.println("Insira o seu e-mail:");
                    emailCliente = input.next();

                    System.out.println("------ Registado com sucesso!! ------");
                    System.out.println(nomeCliente + " | " + contactoCLiente + " | " + emailCliente);

                break;

                case 2:

                    //espaçamento
                    System.out.println();

                    //definir o limite de lugares de estacionamento || o indice do ciclo for || a formula do nr triangular
                    int limite = 121, i = 1, numTri = i * (i + 1) * (1 + 2);

                    for (i = 1; numTri < limite; i++) {

                        //ver e imprimir apenas os múltiplos de 5
                        if (numTri % 5 == 0) {

                            System.out.print("Os lugares de estacionamento livres são: " + numTri);
                        }
                    }

                break;

                case 3:
                    //imprimir todos os jogos (sem duplicados)
                break;

                case 4:
                    //user dá editora, print todos os jogos e categorias
                break;

                case 5:
                    System.out.println("****** | A D E U S | ******");
                break;

                default:
                    System.out.println("------ Opção inválida... ------");
                    System.out.println("------ Tente novamente ------");
            }

        } while (opcao != 5);
    }
}
