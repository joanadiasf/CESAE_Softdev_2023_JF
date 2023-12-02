package Ex_04_FormaGeometrica;

public class Retangulo extends FormaGeometrica{

    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public void calcularArea() {

        System.out.print("A área do retângulo é: ");
        System.out.print(this.largura*this.comprimento);

    }
}
