package Ex_01_AirplaneStore;

import Ex_01_AirplaneStore.Enums.Armas;
import Ex_01_AirplaneStore.Enums.CategoriaJato;
import Ex_01_AirplaneStore.Enums.Instalacoes;

public class Main {
    public static void main(String[] args) {

        //JatoPrivado jatoRico = new JatoPrivado();
        JatoPrivado coisaRico = new JatoPrivado(2,"Rico$$",2024,1000,30,20.5,15,3,6,200,99999,5,6.5, CategoriaJato.LIGHT_JET);

        //add wc,wifi e tomadas
        coisaRico.addInstalacao(Instalacoes.WC);
        coisaRico.addInstalacao(Instalacoes.CINEMA);
        coisaRico.addInstalacao(Instalacoes.COZINHA);

        //sout qq coisa
        System.out.println();
        System.out.println("**** Detalhes ****");
        //listarInstalacoes
        coisaRico.listarInstalacoes();
        System.out.println();
        coisaRico.exibirDetalhes();


        //AviaoCombate combatentes = new AviaoCombate();
        AviaoCombate combateTudo = new AviaoCombate(22,"Maquina de Guerra",2010,3000,20,20,10,3,4,200,200000,"Vietnam",true);

        //add armas (só 3)
        combateTudo.addArma(Armas.BOMBAS);
        combateTudo.addArma(Armas.BOMBAS);
        combateTudo.addArma(Armas.BOMBAS);

        //AviaoCombate combatentes = new AviaoCombate();
        AviaoCombate combateNada = new AviaoCombate(22,"Maquina de Guerra",2010,3000,20,20,10,3,4,200,200000,"Vietnam",true);

        //add mais que 3 armas
        combateNada.addArma(Armas.METRELHADORAS);
        combateNada.addArma(Armas.BOMBAS);
        combateNada.addArma(Armas.TORPETOS);
        combateNada.addArma(Armas.MISSEIS);



        System.out.println();
        System.out.println("**** Detalhes CombateTudo ****");

        //listarArsenal
        combateTudo.listarArsenal();
        System.out.println();
        combateTudo.exibirDetalhes();


        System.out.println();
        System.out.println("**** Detalhes CombateNada ****");

        //listarArsenal 2 aviao
        combateNada.listarArsenal();
        System.out.println();
        combateNada.exibirDetalhes();


        //Catalogo nome = new Catalogo();
        Catalogo avioesAvionetas = new Catalogo();

        System.out.println("**** C A T A L O G O ****");

        //add avioes (jato e combatentes)
        avioesAvionetas.adquirirAviao(coisaRico);

        avioesAvionetas.adquirirAviao(combateTudo);
        avioesAvionetas.adquirirAviao(combateNada);

        //sout valor total catalogo + nomecatalogo.totalcatalogo()+€;
        System.out.println( "Valor Total catálogo: " + avioesAvionetas.totalCatalogo() + "€.");

        //imprimircatalogo
        avioesAvionetas.imprimirCatalogo();





    }
}