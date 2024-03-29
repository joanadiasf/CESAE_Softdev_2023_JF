package Ex_03_1_Pizzaria;

import Ex_03_1_Pizzaria.Enums.UnidadeMedida;

public class Ingrediente {

  private String codigo;
  private String nome;
  private UnidadeMedida medidaIngrediente;
  private double kcalUnidadeMedida;

  // construtor
  public Ingrediente(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcalUnidadeMedida) {
    this.codigo = codigo;
    this.nome = nome;
    this.medidaIngrediente = medidaIngrediente;
    this.kcalUnidadeMedida = kcalUnidadeMedida;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public UnidadeMedida getMedidaIngrediente() {
    return medidaIngrediente;
  }

  public double getKcalUnidadeMedida() {
    return kcalUnidadeMedida;
  }
}
