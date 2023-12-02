package Ex_02_CarRace;

import Ex_02_CarRace.Enums.TipoCombustivel;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Carro fiat = new Carro("Fiat","500",4,140,10, TipoCombustivel.GASOLINA,5,4);
        Carro ford = new Carro("Ford","Fiesta",5,100,20,TipoCombustivel.GPL,15,4);


        Mota vespa = new Mota("Vespa","2.2",5,100,10,TipoCombustivel.DIESEL,2);

        Camiao camiaoTransporte = new Camiao("Mercedes","Work",10,100,20,TipoCombustivel.DIESEL,10,120);


        System.out.println();
        System.out.println("CORRIDA ENTRE FORD E FIAT");
        System.out.println("\nVENCEDOR: ");
        fiat.corrida(ford).exibirDetalhes();

        System.out.println();
        System.out.println("MOTA VS CAMIÃO");
        System.out.println("\nVENCEDOR: ");
        vespa.corrida(camiaoTransporte).exibirDetalhes();

        System.out.println();
        System.out.println("CUSTO DA VIAGEM DE FIAT NUMA VIAGEM DE 150KM");
        System.out.println(fiat.calcularCusto(150.0) + "€.");

        System.out.println();
        System.out.println("VIAGEM DE CAMIÃO");
        System.out.println("viagem 1: ");
        camiaoTransporte.viagem(100,200);
        System.out.println("\nviagem 2: ");
        camiaoTransporte.viagem(200,75);

        vespa.imprimirMota();

    }
}
