package Entidades;

import Entidades.TipoHerois.Herois;
import Itens.ItemHeroi;

import java.util.ArrayList;
import java.util.Random;

public class Vendedor {

    ArrayList<ItemHeroi> loja;

    public void lojaVendedor(){

        //gerar aleatóriamente a loja
        Random random = new Random();

        //arrayList para a "montra"
        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();


        while (arrayIndexAleatorio.size()<10){

            int indexAleatorio = random.nextInt(0,loja.size());

            //if para não serem adicionados repetidos
            if (!arrayIndexAleatorio.contains(indexAleatorio)){

                arrayIndexAleatorio.add(indexAleatorio);




            }
        }
//for
int i=0;
        loja.get(arrayIndexAleatorio.get(i));
        i++;

    }

    public void vender(Herois heroi){

        System.out.println("VENDEEEEEEEEEEEER");

        //pode ser feito no da loja??

    }
}
