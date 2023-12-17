package Entidades;

import Entidades.TipoHerois.Herois;
import Itens.ItemHeroi;

import java.util.ArrayList;

public class Vendedor {

    ArrayList<ItemHeroi> loja;

    public void imprimirLoja(){

        //imprimir ArrayList
        System.out.println("LOJAAAAAAAAAAAAAAAA");
    }

    public void vender(Herois heroi){

        System.out.println("VENDEEEEEEEEEEEER");
    }
}
