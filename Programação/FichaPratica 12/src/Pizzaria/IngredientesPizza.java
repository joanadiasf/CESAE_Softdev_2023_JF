package Pizzaria;

import Pizzaria.Enums.Ingredientes;
import Pizzaria.Enums.UnidadeMedida;

public class IngredientesPizza {
  private Ingredientes ingredientes;
  private String codigo;
  private String nome;
  private UnidadeMedida medida;
  private double calorias;
  private double quantidade;


  public void setQuantidade(double quantidade) {
    this.quantidade = quantidade;
  }


}
