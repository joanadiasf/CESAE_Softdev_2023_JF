package PizzariaPt2;

import Pizzaria.Enums.Tamanho;
import Pizzaria.Ingrediente;
import Pizzaria.IngredientePizza;
import PizzariaPt2.Enums.TipoPizza;

import java.util.ArrayList;

public class Pizza {

        private String codigo;
        private String nome;
        private String descricao;
        private double preco;
        private Tamanho tamanho;

        private TipoPizza tipoPizza;
        private ArrayList<IngredientesPizza> composicao;

        //construtor
        public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho) {
            this.codigo = codigo;
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
            this.tamanho = tamanho;
            this.composicao = new ArrayList<>();

        }

        //add ingrediente ate 5
        public void addIngredientePizza(IngredientesPizza ingredientePizzaNovo){

            if (this.composicao.size() <5){

                this.composicao.add(ingredientePizzaNovo);


            }else {

                System.out.println("/A pizza já está cheia.../");
            }

        }

        //mudar quantidade
        public void mudarQuantidadeIngredientePizza(Ingrediente ingredienteMuda, double quantidadeNova){

            for (IngredientesPizza ingredientePizzaAtual : this.composicao){

                if (ingredientePizzaAtual.getIngrediente()==ingredienteMuda){

                    ingredientePizzaAtual.setQuantidade(quantidadeNova);
                }

            }

        }

        //remover ingrediente atraves do codigo dele
        public void removeIngrediente(String codigoIngrediente){

            for (IngredientesPizza ingredientePizzaAtual : this.composicao){

                if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoIngrediente)){

                    this.composicao.remove(ingredientePizzaAtual);
                    return;
                }

            }

        }

        public double calcularKcal(){

            double kcalTotais=0;

            for (IngredientesPizza ingredientePizzaAtual : this.composicao){

                double quantidadeIngredienteAtual = ingredientePizzaAtual.getQuantidade();
                double kcalQuantidadeIngredienteAtual = ingredientePizzaAtual.getIngrediente().getKcalUnidadeMedida();

                double kcalIngredienteAtual = quantidadeIngredienteAtual*kcalQuantidadeIngredienteAtual;

                kcalTotais+=kcalIngredienteAtual;
            }

            return kcalTotais;

        }


        public void exibirDetalhes(){


            System.out.println("***** " + this.nome + " *****");
            System.out.println("Código: " + this.codigo);
            System.out.println("Descrição: " + this.descricao);
            System.out.println("Preço: " + this.preco);
            System.out.println("Tamanho: " + this.tamanho);

            int contador=1;

            for (IngredientesPizza atual : this.composicao){

                System.out.print("Ingrediente " + contador + "[ " + atual.getIngrediente().getCodigo());
                System.out.print(" | " + atual.getIngrediente().getNome() + " | " + atual.getIngrediente().getMedidaIngrediente());
                System.out.print(" | " + atual.getIngrediente().getKcalUnidadeMedida() + " ] " + atual.getQuantidade() + " " + atual.getIngrediente().getMedidaIngrediente() + "\n");

                contador++;
            }

        }


}
