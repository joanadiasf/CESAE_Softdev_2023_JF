package Ex_04_FormaGeometrica;

public class Triangulo extends FormaGeometrica{

    private double largura;
    private double altura;

    public Triangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {

        System.out.print("A área do triângulo é: ");
        System.out.print((this.altura*this.largura)/2);
    }
}
