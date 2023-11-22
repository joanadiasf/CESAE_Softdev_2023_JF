package Ex_06;

public class Main {
    public static void main(String[] args) {

        Atleta quim = new Atleta("Quim", "Natação",1.7,70,"Portugal");
        Atleta jacinto = new Atleta("Jacinto", "Natação ",2,60,"Espanha");
        Atleta freddy = new Atleta("Freddy","Salto em Altura",1.6,50,"USA");
        Atleta gigi = new Atleta("Gigi","Atletismo",1.9,60,"Alemanha");
        Atleta doloris = new Atleta("Doloris","Ginástica",1.75,47,"Brasil");
        Atleta vitor = new Atleta("Vitor","Salto em Altura", 1.82,67,"Argentina");


        System.out.println("***** COMPETIÇÃO SALTO EM ALTURA *****");

        
        vitor.competicaoAltura(freddy).exibirDetalhes();

        System.out.println();
        System.out.println("***** COMPETIÇÃO NATAÇÃO *****");


        quim.competicaoAltura(jacinto).exibirDetalhes();

    }
}
