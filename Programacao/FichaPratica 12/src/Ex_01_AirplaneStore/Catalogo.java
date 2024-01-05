package Ex_01_AirplaneStore;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> catalogoAvioes;

    public Catalogo() {
        this.catalogoAvioes=new ArrayList<>();
    }

    public void adquirirAviao(Aviao aviaoNovo){

        this.catalogoAvioes.add(aviaoNovo);
    }

    public void venderAviao(int index){

        this.catalogoAvioes.remove(index);
    }

    public double totalCatalogo(){

        double valorCatalogo=0;
        for (Aviao aviaoAtual : this.catalogoAvioes){
            valorCatalogo+=aviaoAtual.getPreco();

        }
        return  valorCatalogo;
    }

    public void imprimirCatalogo(){
        System.out.println("**** CATALOGO AVIOES ****");
        for (Aviao aviaoAtual:this.catalogoAvioes){

            aviaoAtual.exibirDetalhes();
        }
    }
}
