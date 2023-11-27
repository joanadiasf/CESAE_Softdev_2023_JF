package Pizzaria;

import Pizzaria.Enums.Ingredientes;
import Pizzaria.Enums.UnidadeMedida;

import java.util.ArrayList;

public class Ingrediente {

    private String codigo;
    private String nome;
    private UnidadeMedida quantidade;
    private double calorias;
    public double getCalorias() {
        return calorias;
    }
    private ArrayList<Ingredientes> ingredientes;

    public void exibirIngredientes(){

        for (Ingredientes novoIngrediente : this.ingredientes){

            System.out.println("Ingrediente: [ " + this.codigo + " | " + this.nome + " | " + this.quantidade + " | " + this.calorias + " ]");
        }
    }
}
