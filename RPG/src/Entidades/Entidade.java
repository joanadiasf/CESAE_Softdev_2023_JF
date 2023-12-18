package Entidades;

public abstract class Entidade {

    private String nome;
    private int maxHP,HP,forca;
    private Ataques ataques;

    /**
     * Construtor
     * @param nome - nome heroi
     * @param forca - força ataque
     * @param ataques - ataque
     */
    public Entidade(String nome, int forca, Ataques ataques) {
        this.nome = nome;
        this.maxHP = 100;
        this.HP = 100;
        this.forca = forca;
        this.ataques = ataques;
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

    public void setAtaques(Ataques ataques) {
        this.ataques = ataques;
    }

    public void atacarNormal(){

        System.out.println("Está a atacar normal (mensagem a remover??) SUPER ENTIDADE");
        ataques.ataqueNormal();
    }

    public void atacarEspecial(){

        System.out.println("Está a atacar especial (mensagem a remover??) SUPER ENTIDADE");
        ataques.ataqueEspecial();
    }

    public void atacarConsumivel(){

        System.out.println("Está a atacar consumivel (mensagem a remover??)  SUPER ENTIDADE");
        ataques.ataqueConsumivel();
    }
}
