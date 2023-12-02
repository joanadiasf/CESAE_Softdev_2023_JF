package Ex_03_2_PizzariaPt2;

import Ex_03_1_Pizzaria.Enums.UnidadeMedida;

public class Ingredientes {

    private String codigo;
    private String nome;
    private UnidadeMedida medidaIngrediente;
    private double kcal;

    public Ingredientes(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal) {
        this.codigo = codigo;
        this.nome = nome;
        this.medidaIngrediente = medidaIngrediente;
        this.kcal = kcal;
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

    public double getKcal() {
        return kcal;
    }
}
