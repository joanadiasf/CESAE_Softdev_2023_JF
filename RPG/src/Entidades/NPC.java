package Entidades;

public class NPC extends Entidade{


    private int ouro;

    /**
     * Construtor
     * @param nome nome
     * @param forca força
     * @param ouro recompensa
     */
    public NPC(String nome, int HP, int forca, int ouro) {
        super(nome, HP, forca);
        this.ouro = ouro;
    }




    @Override
    public void exibirDetalhes() {

        System.out.println(super.getNome() + " appears *******");
        System.out.println("Força: " + this.getForca());
        System.out.println("Recompensa: " + this.ouro + " ouros");

    }

}
