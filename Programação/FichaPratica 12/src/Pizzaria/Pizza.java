package Pizzaria;

import Pizzaria.Enums.Ingredientes;
import Pizzaria.Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {

    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList <Ingredientes> ingredientes;


    /**
     * Método para adicionar até 5 ingredientes
     * @param ingredienteNovo - ingrediente novo
     */
    public void addIngredientes(Ingredientes ingredienteNovo){


        for (int i=0; i < 5; i++){

            this.ingredientes.add(ingredienteNovo);
        }
    }

    /**
     * Método para remover ingredientes pelo id do elemento
     * @param index - id do elemento
     */
    public void removeIngredientes(int index){

        this.ingredientes.remove(index);
    }

    /**
     * Método para contar as calorias totais da pizza
     * @return - calorias totais
     */
    public double caloriasTotais(){

        double caloriasTotais=0;

        for (Ingredientes somaCal: this.ingredientes){

        //caloriasTotais+=this.getCalorias;

        }

        return caloriasTotais;
    }


}
