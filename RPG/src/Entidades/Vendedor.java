package Entidades;

import Entidades.TipoHerois.Herois;
import Entidades.Tools.LojaRepository;
import Itens.ArmaPrincipal;
import Itens.Consumivel;
import Itens.ItemHeroi;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static Entidades.TipoHerois.BibliotecaFuncoesComuns.lerFicheiro;
public class Vendedor {

    ArrayList<ItemHeroi> loja;

    public Vendedor() throws FileNotFoundException {

        LojaRepository repository = new LojaRepository("src/Itens/ItensHeroiRPG.csv");

        this.loja = repository.getLojaArray();

    }

    /**
     * Método para validar se o Heroi pode user item
     * @param heroi - heroi
     * @param itemHeroi - item
     * @return - se pode ou nao usar
     */
//    public boolean validarPermissao(Herois heroi, ItemHeroi itemHeroi){
//        for (String heroiPermitidoAtual : itemHeroi.getHeroisPermitidos()){
//            if (heroi.getClass().getSimpleName().equals(heroiPermitidoAtual)){
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * Loja do Vendedor
     * @param heroi - Heroi que compra
     * @throws FileNotFoundException - ler file
     */
    public void lojaVendedor(Herois heroi) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

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

        lerFicheiro("src/Entidades/shopScreen.txt");

        for (int i = 0; i <= 10; i++) {

            System.out.println("\nItem " + i + ": ");
            loja.get(arrayIndexAleatorio.get(i)).exibirDetalhes();
        }



        int opcao;

        ArrayList<Consumivel> inventario = new ArrayList<>();
        do {

            System.out.println("Queres alguma coisa? \t 1- Sim \t 2- Não");
            opcao= input.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Escolha o item");
                    int item = input.nextInt();

                    for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
                        if (i == item) {
                            ItemHeroi itemHeroi = loja.get(arrayIndexAleatorio.get(item));



                                if (heroi.getOuro() >= itemHeroi.getPreco()) {

                                    if (itemHeroi instanceof ArmaPrincipal) {
                                        ArmaPrincipal armaPrincipal = (ArmaPrincipal) itemHeroi;
                                        heroi.setArma(armaPrincipal);
                                        loja.remove(armaPrincipal);

                                    } else if (itemHeroi instanceof Consumivel) {
                                        Consumivel consumivel = (Consumivel) itemHeroi;
                                        heroi.getInventario().add(consumivel);
                                        loja.remove(consumivel);
                                    }

                                    heroi.setOuro(heroi.getOuro()-itemHeroi.getPreco());
                                    System.out.println("Obteve o " + itemHeroi.getNome());

                                } else {

                                    System.out.println("Não tem ouro suficiente para comprar este item. Escolha outro item.");
                                    break;
                                }



                        }
                    }

                    break;

                case 2:
                    System.out.println("Adeus e boa sorte!");
                    break;

                default:
                    System.out.println("Opção Inválida...");

            }

        } while (opcao!=2);

    }



}
