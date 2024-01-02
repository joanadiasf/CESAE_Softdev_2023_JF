package Entidades;

import Entidades.TipoHerois.Ataques;
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
     * @param tipoHeroi - tipo de heroi
     * @param itemHeroi - item
     * @return - se pode ou nao usar
     */
    public boolean validarPermissao(Ataques tipoHeroi, ItemHeroi itemHeroi) {
        for (String heroiPermitidoAtual : itemHeroi.getHeroisPermitidos()) {
            if (tipoHeroi.getTipo().equals(heroiPermitidoAtual)) {
                return true;
            }
        }
        return false;
    }


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

        ArrayList<Integer> montra = new ArrayList<>();


        while (montra.size() <= 10) {

            int indexAleatorio = random.nextInt(0, loja.size());

            //if para não serem adicionados repetidos
            if (!montra.contains(indexAleatorio)) {

                montra.add(indexAleatorio);


            }
        }

        lerFicheiro("src/Entidades/shopScreen.txt");

        for (int i = 0; i < montra.size(); i++) {

            System.out.println("\nItem " + i + ": ");
            loja.get(montra.get(i)).exibirDetalhes();
        }



        int opcao;

        ArrayList<Consumivel> inventario = new ArrayList<>();
        do {

            System.out.println("\nOuro disponivel: " + heroi.getOuro());
            System.out.println("Queres alguma coisa? \t 1- Sim \t 2- Não");
            opcao= input.nextInt();

            switch (opcao){

                case 1:

                    System.out.println("Escolha o item :");
                    int item = input.nextInt();


                    for (int i = 0; i < montra.size(); i++) {

                        if (i == item) {


                            if (montra.get(i)==-1){
                                System.out.println("Objeto indisponivel, já foi comprado...");
                                break;
                            }
                            ItemHeroi itemHeroi = loja.get(montra.get(item));
                            Ataques tipoHeroi = heroi.getAtaques();


//                            //está comentado porque senão não deixa comprar nada
//                            if (validarPermissao(tipoHeroi,itemHeroi)){
                                if (heroi.getOuro() >= itemHeroi.getPreco()) {



                                    if (itemHeroi instanceof ArmaPrincipal) {
                                        ArmaPrincipal armaPrincipal = (ArmaPrincipal) itemHeroi;
                                        heroi.setArma(armaPrincipal);

                                        //da set de um valor para nao se alterar o indice dos objetos
                                        montra.set(i,-1);

                                    } else if (itemHeroi instanceof Consumivel) {
                                        Consumivel consumivel = (Consumivel) itemHeroi;
                                        heroi.getInventario().add(consumivel);

                                        //da set de um valor para nao se alterar o indice dos objetos
                                        montra.set(i,-1);
                                    }

                                    heroi.setOuro(heroi.getOuro()-itemHeroi.getPreco());
                                    System.out.println("Obteve o " + itemHeroi.getNome());
                                    System.out.println("Ouro restante: " + heroi.getOuro());

                                } else {

                                    System.out.println("Não tem ouro suficiente para comprar este item. Escolha outro item.");
                                    break;
                                }
//                            }
//                            else {
//                                System.out.println("Este item não é para este tipo de Heroi.");
//                            }
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
