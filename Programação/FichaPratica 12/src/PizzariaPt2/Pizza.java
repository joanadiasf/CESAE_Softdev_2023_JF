package PizzariaPt2;

import PizzariaPt2.Enums.Tamanho;
import PizzariaPt2.Ingredientes;
import PizzariaPt2.Ingrediente_da_Pizza.*;

import java.util.ArrayList;

public class Pizza {

        private String codigo;
        private String nome;
        private String descricao;
        private double preco;
        private Tamanho tamanho;

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


        //add ingrediente
        public void addIngredientePizza(IngredientesPizza ingredientePizzaNovo){

            //add base
           if (this.composicao.size() == 0 && ingredientePizzaNovo.getIngrediente() instanceof Base){

               this.composicao.add(ingredientePizzaNovo);
           }
            //add topping
           if (this.composicao.size() > 0 && this.composicao.size() >5 && ingredientePizzaNovo.getIngrediente() instanceof Topping){

               this.composicao.add(ingredientePizzaNovo);
           }

        }

        //tipo pizza
        public String tipoPizza(){

            int contadorCarne=0, contadorQueijo=0, contadorMar=0,contadorVegetal=0;

            //para a base não contar como topping
            int quantidadeTopping = this.composicao.size()-1;

            for (IngredientesPizza atual: this.composicao){

                if (atual.getIngrediente() instanceof Queijo){
                    contadorQueijo++;
                }

                if (atual.getIngrediente() instanceof Carne){
                    contadorCarne++;
                }

                if (atual.getIngrediente() instanceof FrutoMar){
                    contadorMar++;
                }

                if (atual.getIngrediente() instanceof Vegetal){
                    contadorVegetal++;
                }
            }

            if (contadorCarne ==quantidadeTopping){

                return "Carne";
            }
            else if (contadorVegetal == quantidadeTopping){

                return "Vegetariana";
            }
            else if (contadorMar == quantidadeTopping){

                return "Mar";
            }
            else if (contadorCarne==1 && contadorVegetal==1 && contadorMar==1 && contadorQueijo==1) {

               return "Completa";
            }
            else {
                return "Mista";
            }


        }

        //mudar quantidade
        public void mudarQuantidadeIngredientePizza(Ingredientes ingredienteMuda, double quantidadeNova){

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

                    if (!(ingredientePizzaAtual.getIngrediente() instanceof Base)){

                        this.composicao.remove(ingredientePizzaAtual);
                        return;
                    }

                }

            }

        }

        public double calcularKcal(){

            double kcalTotais=0;

            for (IngredientesPizza ingredientePizzaAtual : this.composicao){

                double quantidadeIngredienteAtual = ingredientePizzaAtual.getQuantidade();
                double kcalQuantidadeIngredienteAtual = ingredientePizzaAtual.getIngrediente().getKcal();

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
                System.out.print(" | " + atual.getIngrediente().getKcal() + " ] " + atual.getQuantidade() + " " + atual.getIngrediente().getMedidaIngrediente() + "\n");

                contador++;
            }

        }


}
