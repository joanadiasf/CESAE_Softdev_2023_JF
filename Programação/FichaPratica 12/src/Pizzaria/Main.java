package Pizzaria;

import Pizzaria.Enums.Tamanho;
import Pizzaria.Enums.UnidadeMedida;

public class Main {

    public static void main(String[] args) {


        //instanciar ingredientes
        Ingrediente basefina = new Ingrediente("I0011","Fina Italiana", UnidadeMedida.GRAMAS,1.5);
        Ingrediente queijo = new Ingrediente("I0022", "Mozarella", UnidadeMedida.GRAMAS, 2.8);
        Ingrediente molho = new Ingrediente("I0090", "Molho Tomate", UnidadeMedida.LITROS,250);
        Ingrediente fiambre= new Ingrediente("I0120", "Fiambre Frango", UnidadeMedida.UNIDADES,12);
        Ingrediente ananas = new Ingrediente("I0100","Ananas",UnidadeMedida.UNIDADES,2);

        Ingrediente basealta= new Ingrediente("I0003","Base Alta",UnidadeMedida.GRAMAS,2);
        Ingrediente molhoOregaos = new Ingrediente("I0091", "Molho Tomate com Oregãos", UnidadeMedida.LITROS,100);
        Ingrediente queijoSerra = new Ingrediente("I0023", "Queijo da Serra da Estrela", UnidadeMedida.GRAMAS, 5);


        //criar pizza
        Pizza queijoFiambre = new Pizza("P001", "Pizza de Queijo e Fiambre", "Basicão",2.9, Tamanho.MEDIA);


        queijoFiambre.addIngredientePizza(new IngredientePizza(basefina,200));
        queijoFiambre.addIngredientePizza(new IngredientePizza(molho,0.100));
        queijoFiambre.addIngredientePizza(new IngredientePizza(queijo,180));
        queijoFiambre.addIngredientePizza(new IngredientePizza(fiambre,12));

        //criar pizza
        Pizza pizzaHavai = new Pizza("P002", "Pizza Havaina", "Ananas na pizza é bom", 15.5, Tamanho.GRANDE);

        pizzaHavai.addIngredientePizza(new IngredientePizza(basefina,235));
        pizzaHavai.addIngredientePizza(new IngredientePizza(molho,0.180));
        pizzaHavai.addIngredientePizza(new IngredientePizza(queijo,200));
        pizzaHavai.addIngredientePizza(new IngredientePizza(ananas,12));


        //mudar ingrediente
        pizzaHavai.mudarQuantidadeIngredientePizza(queijo,120);

        //remover ingrediente
        pizzaHavai.removeIngrediente("I0100");

        //pizza nova
        Pizza portugal = new Pizza("P003","Pizza Portugal", "Tuguinha da veia",20,Tamanho.GRANDE);
        portugal.addIngredientePizza(new IngredientePizza(basealta,100));
        portugal.addIngredientePizza(new IngredientePizza(molhoOregaos,0.200));
        portugal.addIngredientePizza(new IngredientePizza(queijoSerra,150));

        System.out.println("Kcal pizza Portugal" + portugal.calcularKcal()); //tem que dar 1720.0

    }

}
