package Entidades;

public abstract class Entidade {

    private String nome;
    private int maxHP,HP,forca;
    private Ataques ataques;

    /**
     * Construtor
     * @param nome - nome heroi
     * @param maxHP - vida máxima
     * @param HP - vida atual
     * @param forca - força ataque
     * @param ataques - ataque
     */
    public Entidade(String nome, int maxHP, int HP, int forca, Ataques ataques) {
        this.nome = nome;
        this.maxHP = maxHP;
        this.HP = HP;
        this.forca = forca;
        this.ataques = ataques;
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
