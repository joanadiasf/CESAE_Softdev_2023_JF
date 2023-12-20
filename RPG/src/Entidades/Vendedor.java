package Entidades;

import Entidades.TipoHerois.Herois;
import Entidades.Tools.LojaRepository;
import Itens.InventarioHerois;
import Itens.ItemHeroi;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vendedor {

    ArrayList<ItemHeroi> loja;

    public Vendedor() throws FileNotFoundException {

        LojaRepository repository = new LojaRepository("src/Itens/ItensHeroiRPG.csv");

        this.loja = repository.getLojaArray();
        //this.loja= repositorio get array
    }

    public ArrayList<Integer> lojaVendedor() {

        //gerar aleatóriamente a loja
        Random random = new Random();

        //arrayList para a "montra"
        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();


        while (arrayIndexAleatorio.size() <= 10) {

            int indexAleatorio = random.nextInt(0, loja.size());

            //if para não serem adicionados repetidos
            if (!arrayIndexAleatorio.contains(indexAleatorio)) {

                arrayIndexAleatorio.add(indexAleatorio);


            }
        }

        for (int i = 0; i <= 10; i++) {

            loja.get(arrayIndexAleatorio.get(i));
        }


        return arrayIndexAleatorio;






//        comprar(arrayIndexAleatorio);

    }

    public ArrayList<InventarioHerois> comprar(ArrayList<Integer> arrayIndexAleatorio) {

        Scanner input = new Scanner(System.in);

        ArrayList<InventarioHerois> inventario = new ArrayList<>();

        System.out.println(lojaVendedor());

        int opcao;

        do {

           System.out.println("Queres alguma coisa? \t 1- Sim \t 2- Não");
           opcao= input.nextInt();

            switch (opcao){

                case 1:

                    //todo _________________

                    break;

                case 2:
                    System.out.println("Adeus e boa sorte!");
                    break;

                default:
                    System.out.println("Opção Inválida...");

            }

        } while (opcao!=2);



        return inventario;
    }

}
