package Ex_01;

public class Main {

    public static void main(String[] args) {


        Carro ibiza = new Carro("Seat","Ibiza",12,20,3000,TipoCombustivel.DIESEL,10);
        Carro mercedes = new Carro("Mercedes","A45",5,500,2333,TipoCombustivel.DIESEL,15);
        Carro ferrari = new Carro("Ferrari","Vermelho",3,900,1200,TipoCombustivel.DIESEL,50);
        Carro lamborguini = new Carro("Lamborguini","Preto",4,1000,2000,TipoCombustivel.DIESEL,55);


        System.out.println();

        System.out.println("* * * * *  L I G A R  O  C A R R O  * * * * *");

        ibiza.ligado();
        System.out.println();

        mercedes.ligado();
        System.out.println();

        ferrari.ligado();
        System.out.println();

        lamborguini.ligado();
        System.out.println();


        System.out.println("* * * * *  C O R R I D A  * * * * *");
        System.out.println();

        Carro vencedorCorrida1 = mercedes.corrida(lamborguini);
        System.out.println("**** VENCEDOR CORRIDA 1****");
        if (vencedorCorrida1==null){
            System.out.println("EMPATE");
        }
        else {
            vencedorCorrida1.exibirDetalhes();
        }

        System.out.println();

        Carro vencedorCorrida2 = ferrari.corrida(ibiza);
        System.out.println("**** VENCEDOR CORRIDA 2****");
        if (vencedorCorrida2==null){
            System.out.println("EMPATE");
        }
        else {
            vencedorCorrida2.exibirDetalhes();
        }

        System.out.println();

        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2);
        System.out.println("**** VENCEDOR FINAL ****");
        if (vencedorFinal==null){
            System.out.println("EMPATE");
        }
        else {
            vencedorFinal.exibirDetalhes();
        }

        System.out.println();

        System.out.println("* * * * *  L I T R O S   A O   F I M   D E   9 7 K M  * * * * *");
        System.out.println();


        System.out.println(lamborguini.litros(97));
        System.out.println(ferrari.litros(97));

        if (ferrari.litros(97) > lamborguini.litros(97)){

            System.out.println("***** MAIOR GASTO ******");
           ferrari.exibirDetalhes();
        }
        else {

            System.out.println("***** MAIOR GASTO ******");
            lamborguini.exibirDetalhes();
        }




    }
}
