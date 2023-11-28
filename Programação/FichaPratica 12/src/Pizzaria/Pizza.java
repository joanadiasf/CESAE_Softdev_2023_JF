package Pizzaria;

import Pizzaria.Enums.Ingredientes;
import Pizzaria.Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {

   private String id;
   private String nome;
   private String descricao;
   private double preco;
   private Tamanho tamanho;
   private ArrayList<IngredientesPizza> ingredientes;
   final int MAX_INGREDIENTES=5;

   public Pizza(String id, String nome, String descricao, double preco, Tamanho tamanho) {
      this.id = id;
      this.nome = nome;
      this.descricao = descricao;
      this.preco = preco;
      this.tamanho = tamanho;
      this.ingredientes=new ArrayList<>();
   }


   //*************************************************

   /**
    * Método para adicionar novo ingrediente (Max. 5)
    * @param novoIngrediente - ingrediente a ser adicionado
    */
   public void addIngredientes(IngredientesPizza novoIngrediente){

      for (int i=0; i < MAX_INGREDIENTES;i++){

         this.ingredientes.add(novoIngrediente);
      }
   }

//   /**
//    * Método para alterar a quantidade de um ingrediente
//    * @param quantidade - nova quantidade
//    */
//   public void alterarQuantidadeIngrediente(double quantidade){
//
//      this.setQuantidade(quantidade);
//   }



   /**
    * Método para remover ingrediente da pizza
    * @param id - id pizza
    */
   public void removeIngrediente(String id){

      this.ingredientes.remove(id);
   }

   //calorias pizza


   public void exibirDetalhesPizza(){


   }

}
