package Entidades;

public class NPC extends Entidade{


    private int ouro;

    /**
     * Construtor
     * @param nome nome
     * @param forca força
     * @param ataques ataques
     * @param ouro recompensa
     */
    public NPC(String nome, int forca, Ataques ataques, int ouro) {
        super(nome, forca, ataques);
        this.ouro = ouro;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println(super.getNome() + "appears *******");
        System.out.println("Força: " + this.getForca());
        System.out.println("Recompensa: " + this.ouro);

    }

}
