package Pizzaria;

import Pizzaria.Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {

  private String codigo;
  private String nome;
  private String descricao;
  private double preco;
  private Tamanho tamanho;

  private ArrayList<IngredientePizza> composicao;

  //construtor
  public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho) {
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.tamanho = tamanho;

  }

  //add ingrediente ate 5
  public void addIngredientePizza(IngredientePizza ingredientePizzaNovo){

    if (this.composicao.size() <5){

      this.composicao.add(ingredientePizzaNovo);
      System.out.println("*Adicionado!*");

    }else {

      System.out.println("/A pizza já está cheia.../");
    }

  }

  //mudar quantidade
  public void mudarQuantidadeIngredientePizza(Ingrediente ingrediente, double quantidadeNova){

    for (IngredientePizza ingredientePizzaAtual : this.composicao){

      if (ingredientePizzaAtual.getIngrediente()==ingrediente){

        ingredientePizzaAtual.setQuantidade(quantidadeNova);
      }

    }

  }

  //remover ingrediente atraves do codigo dele
  public void removeIngrediente(String codigoIngrediente){

    for (IngredientePizza ingredientePizzaAtual : this.composicao){

      if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoIngrediente)){

        this.composicao.remove(ingredientePizzaAtual);
        return;
      }

    }

  }

  public double calcularKcal(){

    double kcalTotais=0;

    for (IngredientePizza ingredientePizzaAtual : this.composicao){

      double quantidadeIngredienteAtual = ingredientePizzaAtual.getQuantidade();
      double kcalQuantidadeIngredienteAtual = ingredientePizzaAtual.getIngrediente().getKcalUnidadeMedida();

      double kcalIngredienteAtual=  quantidadeIngredienteAtual*kcalQuantidadeIngredienteAtual;

      kcalTotais+=kcalIngredienteAtual;
    }

    return kcalTotais;

  }


}
