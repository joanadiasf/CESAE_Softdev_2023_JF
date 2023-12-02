package Ex_03_2_PizzariaPt2.Ingrediente_da_Pizza;

import Ex_03_1_Pizzaria.Enums.UnidadeMedida;
import Ex_03_2_PizzariaPt2.Enums.TipoBase;
import Ex_03_2_PizzariaPt2.Ingredientes;

public class Base  extends Ingredientes {

    private TipoBase tipoBase;
    private String descricao;

    public Base(String codigo, String nome, double kcal, TipoBase tipoBase, String descricao) {
        super(codigo, nome, UnidadeMedida.GRAMAS, kcal);
        this.tipoBase = tipoBase;
        this.descricao = descricao;
    }
}
