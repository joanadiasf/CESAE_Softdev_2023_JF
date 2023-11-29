package PizzariaPt2;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Enums.TipoBase;

public class Base  extends Ingredientes{

    private TipoBase tipoBase;
    private String descricao;

    public Base(String codigo, String nome, UnidadeMedida medidaIngrediente, double kcal, TipoBase tipoBase, String descricao) {
        super(codigo, nome, UnidadeMedida.GRAMAS, kcal);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
