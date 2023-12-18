package Entidades;

public abstract class Entidade {

    private String nome;
    private int maxHP,HP,forca;

    /**
     * Construtor
     * @param nome - nome heroi
     * @param forca - força ataque
     *              TODO:_______________________
     */

    public Entidade(String nome, int HP, int forca) {
        this.nome = nome;
        this.maxHP =HP;
        this.HP = HP;
        this.forca = forca;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public abstract void exibirDetalhes();


}
