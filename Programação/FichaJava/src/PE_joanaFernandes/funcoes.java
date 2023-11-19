package PE_joanaFernandes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class funcoes {


//*******************************************************************************************************
//*******************************************************************************************************
//********************************* M E N U   A D M I N *************************************************
//*******************************************************************************************************
//*******************************************************************************************************
    /**
     * Método para verificar se a palavra-passe está correta e se não ultrapassa as 3 tentativas
     */

    public static void password() {

        Scanner input = new Scanner(System.in);


        String password, passwordTentativa;
        password = "123456789";



        System.out.print("Introduza a palavra-passe:");
        passwordTentativa = input.next();


        if (passwordTentativa.equals(password)) {


            System.out.println();
            System.out.println("***| B E M - V I N D O  A D M I N|***");


        }
        while (!passwordTentativa.equals(password) ) {
            System.out.println("/!/ Palavra-passe incorreta... /!/");


            System.out.println();
            System.out.println("------ Tente novamente... ------");

            System.out.println();
            System.out.print("Introduza a palavra-passe:");
            passwordTentativa = input.next();

            //para caso o utilizador acerte entretanto
            if (passwordTentativa.equals(password)) {

                System.out.println("***| B E M - V I N D O  A D M I N|***");


            }


        }




    }

//*******************************************************************************************************
    /**
     * Transforma o ficheiro CSV numa matriz
     *
     * @throws FileNotFoundException - excepçao
     */
    public static String[][] fileEmMatriz() throws FileNotFoundException {

//                Scanner fileScanner = new Scanner(new File("FichaJava/src/PE_joanaFernandes/GameStart_V2.csv"));
        Scanner fileScanner = new Scanner(new File("src/PE_joanaFernandes/GameStart_V2.csv"));

        int i = 0;

        //linha cabeçalho;
        String linha = fileScanner.nextLine();

        //declarar matriz
        String[][] matriz = new String[125][9];

        //ler ficheiro e transformar em matriz
        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();

            //as "colunas" são divididas por , então: split
            String[] divisor = linha.split(";");


            for (int c = 0; c < 9 && c < divisor.length; c++) {

                matriz[i][c] = divisor[c];
            }

            i++;


        }

        fileScanner.close();

        return matriz;
    }

//*******************************************************************************************************
    /**
     * Apresenta a matriz
     * @param matriz - recebe a matriz da função que a cria
     */
    public static void apresentarMatriz(String [][] matriz) {


        //apresentar matriz
        String strg = "";
        int contador=0;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {

                    strg += matriz[l][c] + "\t";

            }
            strg += "\n";
        }

        //imprimir FORA do for para so aparecer o que se quer
        System.out.println("\n");
        System.out.println(strg);




    }

//*******************************************************************************************************
    /**
     * Método para contar nr de jogos vendidos e para somar os seus valores
     * @param matriz - parametro a ser avaliado
     */
    public static void jogosVendidos(String[][] matriz)  {

        double valor = 0,total=0;
        int contaLinhas = matriz.length;

        for(int linha=0; linha< matriz.length;linha++){

            //sei q os valores q tenho que somar estão na coluna 9
            valor=(Double.parseDouble(matriz[linha][8]));

            total+= valor;
        }

        System.out.println();
        System.out.println("Vendeu " + contaLinhas + " jogos e fez " + total + "€.");
        System.out.println();
    }

//*******************************************************************************************************
    /**
     * Método para pegar no valor total das vendas e ver quanto é o lucro (20%)
     * @param matriz - parametro a ser avalidado
     */
    public static void lucroJogos(String[][] matriz){

        double valor = 0,total=0;

        for(int linha=0; linha< matriz.length;linha++){

            //sei q os valores q tenho que somar estão na coluna 9
            valor=(Double.parseDouble(matriz[linha][8]));

            total+= valor;
        }

        //conta para ver os 20% de lucro
        total=total*0.2;

        System.out.println();
        System.out.println("O seu lucro é de: " + valor + "€");
        System.out.println();

    }

//*******************************************************************************************************
    /**
     * Método para pesquisar o id de um cliente e imprimir nome,contacto e email respetivos
     * @param matriz - parametro a ser avaliado
     * @throws FileNotFoundException - excepçao
     */
    public static void pesquisaIdCliente(String[][] matriz) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        //puxar a matriz para esta função
        fileEmMatriz();

        //para receber o input || contador para o mesmo id nao se repetir quando é impresso
        int pesquisaID,contador=0;


        //utilizador procura na coluna 1
        //e imprime a coluna 2, 3 e 4 correspondente

        System.out.println();
        System.out.print("Qual o IDCliente que quer pesquisar? ");
        pesquisaID = input.nextInt();


        for (int l=0;l < matriz.length;l++){

            //comparar e transformar a coluna 1 num nr inteiro
            if (pesquisaID == Integer.parseInt(matriz[l][1]) && contador ==0){

                //Imprimir info correspondente
                System.out.println();
                System.out.println(matriz[l][2] + "|" + matriz[l][3] + "|" + matriz[l][4]);
                System.out.println();


                contador++;
            }

        }


    }

//*******************************************************************************************************
    /**
     * Método para ver qual o jogo mais caro e imprimir quem o comprou
     * @param matriz - parametro a ser avaliado
     * @throws FileNotFoundException - excepçao
     */
    public static void bestseller(String[][] matriz) throws FileNotFoundException {

        //puxar a matriz para esta função
        fileEmMatriz();

        double maisCaro;
        double preco= Double.parseDouble(matriz[0][8]);
        String nomeJogo = matriz[0][7];



        //para saber qual o jogo mais caro
        for (int l=1; l < matriz.length;l++){

            maisCaro=Double.parseDouble(matriz[l][8]);

            if (preco > maisCaro){

               //continuar a fazer a comparaçao ate ao fim do loop
                preco=maisCaro;

                //vai guardar o nome do jogo mais caro
                nomeJogo=matriz[l][7];


                //imprimir o nome de quem comprou
                if (nomeJogo.equals(matriz[l][7])){


                    System.out.println("** Cliente: " + matriz[l][2]);
                }

            }

        }
        System.out.println();
        System.out.println("***** O JOGO MAIS CARO É: " + nomeJogo + " *****");
        System.out.println();



    }

//*******************************************************************************************************
    /**
     * Menu do Administrador
     *
     * @param escolha - input necessário p/ função trabalhar
     */
    public static void menuAdmin(String escolha) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;


//"menu"
        do {
            System.out.println("*****| M E N U |*****");
            System.out.println("1. Conteúdo CSV  - print.");
            System.out.println("2. Ver total de vendas e valor total.");
            System.out.println("3. Total de Lucro.");
            System.out.println("4. Pesquisar cliente por ID.");
            System.out.println("5. Ver jogo mais caro e vendas.");
            System.out.println("6. Sair.");

            System.out.println();
            System.out.print("Escolha a opção:");
            opcao = input.nextInt();

            //menu
            switch (opcao) {

                case 1:
                    //ler csv file
                    apresentarMatriz(fileEmMatriz());

                break;

                case 2:
                    //quantas vendas foram executadas e valor total
                    jogosVendidos(fileEmMatriz());

                break;

                case 3:
                    //total de lucro - 20% de cada jogo
                    lucroJogos(fileEmMatriz());

                break;

                case 4:
                    //pesquisa idcliente - tem nome contacto e email
                    pesquisaIdCliente(fileEmMatriz());

                break;

                case 5:
                    //print jogo mais caro e quem o comprou(todos os cliente)
                    bestseller(fileEmMatriz());

                break;

                case 6:
                    System.out.println("****** | A D E U S | ******");
                break;

                default:
                    System.out.println("------ Opção inválida... ------");
                    System.out.println("------ Tente novamente ------");
            }

        } while (opcao != 6);

    }

//*******************************************************************************************************
//*******************************************************************************************************
//********************************* M E N U   C L I E N T E *********************************************
//*******************************************************************************************************
//*******************************************************************************************************
    /**
     * Registo do cliente e confirmação de registo
     */
    public static void registoCLiente(){

        Scanner input = new Scanner(System.in);

        String nomeCliente, emailCliente;
        int contactoCLiente;

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

    }

//*******************************************************************************************************
    /**
     * Números triangulares até 121 que são múltiplos de 5
     */
    public static void estacionamentoLugares(){


        //espaçamento
        System.out.println();

        //definir o limite de lugares de estacionamento
        int limite = 121;
        int i = 1;

        //enquanto o resultado da conta for menor que o limite 121
        while (i * (i + 1) / 2 < limite) {

            //criar variavel para guardar a formula (se ela for instanciada antes do while nao imprime nada)
            int numTri = i * (i + 1) / 2;

            //verificar se sao multiplos de 5 e ai imprimir
            if (numTri % 5 == 0) {
                System.out.println("O lugar de estacionamento livre (número triangular) é: " + numTri);
            }

            i++;
        }
    }

//*******************************************************************************************************

    /**
     * Método para imprimir os jogos disponiveis sem aparecerem duplicados
     * @param matriz - parametro a ser analisado
     * @throws FileNotFoundException - excepçao
     */
    public static void jogosDisponiveis(String[][] matriz) throws FileNotFoundException {



        //puxar a matriz para esta função
        fileEmMatriz();

        //contador para saltar duplicados
        int contador=0;

        //comparar a matriz com ela mesma para achar os duplicados
        for (int l=0; l < matriz.length;l++){

                 for (int i=0; i < matriz.length; i++){

                     //para nao se comparar o mesmo elemento l!=i
                     if (l!=i && matriz[l][7].equals(matriz[i][7]) && contador==0) {

                         contador++;
                     }
                 }

                 if (contador==0) {
                     System.out.println(matriz[l][7]);
                 }
                 //é necessário reiniciar o contador
                 else {
                     contador=0;
                 }


        }


        //espaçamento
        System.out.println();

    }

//*******************************************************************************************************

    /**
     * Método para pesquisar jogo e categoria dentro de um editora
     * @param matriz - parametro a ser analisado
     * @throws FileNotFoundException - excepçao
     */

    //Loop /!/     /!/     /!/     /!/     /!/     /!/     /!/     /!/     /!/     /!/     /!/
    public static void pesquisaEditora(String[][] matriz) throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        //puxar a matriz para esta função
        fileEmMatriz();

        //para receber o input
        String pesquisaEditora;


        System.out.println();
        System.out.print("Qual a editora que quer pesquisar? (Não usar espaços)");
        pesquisaEditora = input.next();


        boolean editoraJaImpressa = false;
        boolean jogoJaImpresso = false;
        boolean categoriaJaImpressa = false;


        for (int l = 0; l < matriz.length; l++) {

            

            //para se pesquisar ler as strings que tenham mais que uma palavra
            String editora = matriz[l][5].replace(" ", "");

            //peesquisa do utilizador foi encontrada
            if (pesquisaEditora.equals(editora)) {

                for (int i = 0; i < l; i++) {

                    //para guardar a editora anterior
                    String editoraAnterior = matriz[i][5].replace(" ", "");

                    //se ela se repetir a boolean passa para true

                    if (editora.equals(editoraAnterior) ) {
                        editoraJaImpressa = true;

                    }
                }

                if (editoraJaImpressa == false) {
                    System.out.println("***** " + editora + " *****");
                }

                String categoria = matriz[l][6];


                for (int i = 0; i < l; i++) {

                    //guardar categoria anterior
                    String categoriaAnterior = matriz[i][6];

                    //se ela se repetir a boolean passa para true
                    if (categoria.equals(categoriaAnterior) && i!=1) {
                        categoriaJaImpressa = true;

                    }


                }

                if (categoriaJaImpressa == false) {
                    System.out.println("--- " + categoria + " ---");

                }


                String jogo = matriz[l][7];

                for (int i = 0; i < l; i++) {

                    //guardar jogo anterior
                    String jogoAnterior = matriz[i][7];

                    //se ela se repetir a boolean passa para true
                    if (jogo.equals(jogoAnterior) && i!=1) {
                        jogoJaImpresso = true;

                    }
                }

                if (jogoJaImpresso == false) {
                    System.out.println("> " + jogo + " <");
                }
            }
        }



    }

//*******************************************************************************************************
    /**
     * Menu do Cliente
     *
     * @param escolha - input necessário p/ função trabalhar
     */
    public static void menuClient(String escolha) throws FileNotFoundException{

        Scanner input = new Scanner(System.in);

        int opcao;


        //menu
        do {

            System.out.println("*****| M E N U |*****");

            System.out.println("1. Inserir cliente novo.");
            System.out.println("2. Procurar por estacionamento.");
            System.out.println("3. Ver títulos de jogos disponíveis.");
            System.out.println("4. Pesquisa por editora.");
            System.out.println("5. Sair.");

            System.out.println();
            System.out.print("O que pretende fazer?");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    //registo cliente
                    registoCLiente();

                break;

                case 2:
                    //estacionamento
                    estacionamentoLugares();

                break;

                case 3:
                    //imprimir todos os jogos (sem duplicados)
                    jogosDisponiveis(fileEmMatriz());

                break;

                case 4:
                    //user dá editora, print todos os jogos e categorias
                    pesquisaEditora(fileEmMatriz());

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
