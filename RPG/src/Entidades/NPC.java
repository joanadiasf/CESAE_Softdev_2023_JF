package Entidades;

public class NPC {

    private String nome;
    private int ouro;
    private int maxHP,HP,forca;  //porque o NPC também ataca

    /**
     * Construtor
     * @param nome - nome NPC
     * @param ouro - ouro que dá de recompensa
     * @param maxHP - vida máxima
     * @param HP - vida atual
     * @param forca - força do bicho
     */
    public NPC(String nome, int ouro, int maxHP, int HP, int forca) {
        this.nome = nome;
        this.ouro = ouro;
        this.maxHP = maxHP;
        this.HP = HP;
        this.forca = forca;
    }
}
