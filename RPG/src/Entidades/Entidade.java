package Entidades;

public abstract class Entidade {

    private String nome;
    private int maxHP,HP,forca;


    public Entidade(String nome, int HP, int forca) {
        this.nome = nome;
        this.maxHP = HP;
        this.HP = HP;
        this.forca = forca;
    }

    //*************************************************************** GETTERs
    public String getNome() {
        return nome;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return HP;
    }
    public int getForca() {
        return forca;
    }

    //*************************************************************** SETTERs
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    //*************************************************************** MÉTODOS
    public abstract void exibirDetalhes();


}
