package Ex_01;

public class Retangulo extends FiguraGeometrica{

    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
