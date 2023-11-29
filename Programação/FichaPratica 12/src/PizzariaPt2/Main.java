package PizzariaPt2;

import Pizzaria.Enums.UnidadeMedida;
import PizzariaPt2.Ingredientes;
import PizzariaPt2.Enums.Tamanho;
import PizzariaPt2.Enums.TipoBase;
import PizzariaPt2.Ingrediente_da_Pizza.Base;

public class Main {

    public static void main(String[] args) {

        Base baseFina = new Base("I-0011", "Base Fina Italiana", 1.5, TipoBase.MASSA_FINA,"Mais italiana não há");

        Ingredientes queijoMozarella = new Ingredientes("I-0022", "Queijo Mozarella", UnidadeMedida.GRAMAS, 2.8);
        Ingredientes molhoTomate = new Ingredientes("I-0090", "Molho Tomate", UnidadeMedida.LITROS, 250);
        Ingredientes fiambre = new Ingredientes("I-0120", "Fiambre Perna Extra", UnidadeMedida.UNIDADES, 12);
        Ingredientes ananas = new Ingredientes("I-0100", "Ananás", UnidadeMedida.UNIDADES, 2);
        Ingredientes baseAlta = new Ingredientes("I-0012", "Base Alta", UnidadeMedida.GRAMAS, 2);
        Ingredientes molhoTomateOregaos = new Ingredientes("I-0091", "Molho Tomate c/ Oregãos", UnidadeMedida.LITROS, 100);
        Ingredientes queijoSerra = new Ingredientes("I-0023", "Queijo Serra Estrela", UnidadeMedida.GRAMAS, 10);

        // Criar pizza de queijo e fiambre
        Pizza pizzaQueijoFiambre = new Pizza("P-0001", "Pizza de Queijo e Fiambre", "Mais básica impossível", 9.90, Tamanho.MEDIA);

        pizzaQueijoFiambre.addIngredientePizza(new IngredientesPizza(baseFina, 200));
        pizzaQueijoFiambre.addIngredientePizza(new IngredientesPizza(molhoTomate, 0.100));
        pizzaQueijoFiambre.addIngredientePizza(new IngredientesPizza(queijoMozarella, 180));
        pizzaQueijoFiambre.addIngredientePizza(new IngredientesPizza(fiambre, 12));

        pizzaQueijoFiambre.exibirDetalhes();

        // Criar pizza havai
        Pizza pizzaHavai = new Pizza("P-0002", "Pizza Havai", "Com todo o ananás que tem direito", 15.50, Tamanho.GRANDE);

        pizzaHavai.addIngredientePizza(new IngredientesPizza(baseFina, 235));
        pizzaHavai.addIngredientePizza(new IngredientesPizza(molhoTomate, 0.180));
        pizzaHavai.addIngredientePizza(new IngredientesPizza(queijoMozarella, 200));
        pizzaHavai.addIngredientePizza(new IngredientesPizza(ananas, 16));

        pizzaHavai.mudarQuantidadeIngredientePizza(queijoMozarella, 120);
        pizzaHavai.mudarQuantidadeIngredientePizza(queijoSerra,12.0);

        System.out.println("Kcal Pizza Havai: " + pizzaHavai.calcularKcal());
        pizzaHavai.exibirDetalhes();





    }
}
