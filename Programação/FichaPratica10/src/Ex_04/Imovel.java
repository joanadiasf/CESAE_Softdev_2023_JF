package Ex_04;

import java.io.FileNotFoundException;

import static Lib.BibliotecaFicheiros.imprimirFicheiro;

public class Imovel {

    private String rua;
    private String nrPorta;
    private String cidade;
    private Tipo tipoImovel;
    private Acabamento acabamentoImovel;
    private int area;
    private int nrQuartos;
    private int nrWc;
    private int areaPiscina;

    /**
     * Construtor
     * @param rua - rua
     * @param nrPorta - número da porta
     * @param cidade - cidade
     * @param tipoImovel - tipo de imóvel
     * @param acabamentoImovel - acabamento
     * @param area- area (m)
     * @param nrQuartos - numero de quarto
     * @param nrWc - numero casas de banho
     * @param areaPiscina - area da piscina (m)
     */
    public Imovel(String rua, String nrPorta, String cidade, Tipo tipoImovel, Acabamento acabamentoImovel, int area, int nrQuartos, int nrWc, int areaPiscina) {
        this.rua = rua;
        this.nrPorta = nrPorta;
        this.cidade = cidade;
        this.tipoImovel = tipoImovel;
        this.acabamentoImovel = acabamentoImovel;
        this.area = area;
        this.nrQuartos = nrQuartos;
        this.nrWc = nrWc;
        this.areaPiscina = areaPiscina;
    }

    /**
     * Método para calcular o valor do imóvel
     */
    public double valorImovel(){

        //começar com "fixos"
        double valor = (this.nrQuartos*7500)+(this.nrWc*10500)+(this.areaPiscina*1000);

        //os sem %
        switch (this.tipoImovel){

            case APARTAMENTO:
                valor+=(this.area*1000);
                break;

            case CASA:
                valor+=(this.area*3000);
                break;

            case MANSAO:
                valor+=(this.area*5000);

        }
        //os com %
        switch (this.acabamentoImovel){

            case PARA_RESTAURO:
                valor=valor*0.5;
                break;

            case USADA:
                valor=valor-(valor*0.1);
                break;

            case NOVA_COM_ACABAMENTO:
                valor=valor+(valor*0.25);
        }

        return valor;
    }

    public void setAcabamentoImovel(Acabamento acabamentoImovel) {
        this.acabamentoImovel = acabamentoImovel;
    }

    /**
     * Exibir detalhes
     */
    public void exibirDetalhesDesenho() throws FileNotFoundException {

        System.out.println("Rua: " + this.rua);
        System.out.println("Número da Porta " + this.nrPorta);
        System.out.println("Cidade : " + this.cidade);
        System.out.println("Tipo de imóvel: " + this.tipoImovel);
        System.out.println("Estado: " + this.acabamentoImovel);
        System.out.println("Área: " + this.area);
        System.out.println("Número de Quartos: " + this.nrQuartos);
        System.out.println("Número de Casas de Banho: " + this.nrWc);
        System.out.println("Área da piscina: " + this.areaPiscina);

        System.out.println();

        imprimirFicheiro("Files/house.txt");

    }
    public void exibirDetalhesDesenhoCaixa() throws FileNotFoundException {

        System.out.println("Rua: " + this.rua);
        System.out.println("Número da Porta " + this.nrPorta);
        System.out.println("Cidade : " + this.cidade);
        System.out.println("Tipo de imóvel: " + this.tipoImovel);
        System.out.println("Estado: " + this.acabamentoImovel);
        System.out.println("Área: " + this.area);
        System.out.println("Número de Quartos: " + this.nrQuartos);
        System.out.println("Número de Casas de Banho: " + this.nrWc);
        System.out.println("Área da piscina: " + this.areaPiscina);

        System.out.println();

        imprimirFicheiro("Files/cardbox.txt");




        System.out.println();

    }
    public void exibirDetalhes(){

        System.out.println("Rua: " + this.rua);
        System.out.println("Número da Porta " + this.nrPorta);
        System.out.println("Cidade : " + this.cidade);
        System.out.println("Tipo de imóvel: " + this.tipoImovel);
        System.out.println("Estado: " + this.acabamentoImovel);
        System.out.println("Área: " + this.area);
        System.out.println("Número de Quartos: " + this.nrQuartos);
        System.out.println("Número de Casas de Banho: " + this.nrWc);
        System.out.println("Área da piscina: " + this.areaPiscina);

        System.out.println();

    }
    public String getRua() {
        return rua;
    }

    /**
     * Método para ver qual a casa mais cara
     * @param casa2 - casa a comparar
     * @return - casa mais cara
     */
    public Imovel maisCaro(Imovel casa2){

    if (this.valorImovel() > casa2.valorImovel()){

        return this;
    }

    if (this.valorImovel() < casa2.valorImovel()){

        return casa2;
    }

    else {

        return null;
    }

    }



}
