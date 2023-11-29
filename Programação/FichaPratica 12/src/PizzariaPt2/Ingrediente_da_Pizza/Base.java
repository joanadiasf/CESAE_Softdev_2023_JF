package PizzariaPt2.Ingrediente_da_Pizza;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Enums.TipoBase;
import PizzariaPt2.Ingredientes;

public class Base  extends Ingredientes {

    private TipoBase tipoBase;
    private String descricao;

    public Base(String codigo, String nome, double kcal, TipoBase tipoBase, String descricao) {
        super(codigo, nome, UnidadeMedida.GRAMAS, kcal);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
