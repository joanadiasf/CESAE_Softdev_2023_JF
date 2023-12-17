package Itens;

public class ArmaPrincipal extends ItemHeroi{

    private int ataqueArma;
    private int ataqueEspecialArma;

    public ArmaPrincipal(int ataqueArma, int ataqueEspecialArma) {
        this.ataqueArma = ataqueArma;
        this.ataqueEspecialArma = ataqueEspecialArma;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Poder de Ataque: " + this.ataqueArma);
        System.out.println("Poder de Ataque Especial: " + this.ataqueEspecialArma);
    }
}
