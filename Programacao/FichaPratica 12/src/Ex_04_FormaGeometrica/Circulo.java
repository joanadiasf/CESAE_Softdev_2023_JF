package Ex_04_FormaGeometrica;

public class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {

        System.out.print("A área do círculo é: ");
        System.out.print(3.1415*(raio*raio));
    }
}
