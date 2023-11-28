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

  public IngredientesPizza(Ingredientes ingredientes, String codigo, String nome, UnidadeMedida medida, double calorias, double quantidade) {
    this.ingredientes = ingredientes;
    this.codigo = codigo;
    this.nome = nome;
    this.medida = medida;
    this.calorias = calorias;
    this.quantidade = quantidade;
  }

  public void setQuantidade(double quantidade) {
    this.quantidade = quantidade;
  }


}
