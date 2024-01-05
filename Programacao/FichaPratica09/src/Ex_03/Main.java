package Ex_03;

public class Main {

    public static void main(String[] args) {


        //Instanciar um retangulo
        Retangulo retangulo_01 = new Retangulo(10,7);
        Retangulo retangulo_02 = new Retangulo(200,15);


        //Calcular
        System.out.println("Área: " + retangulo_01.calcularArea());
        System.out.println("Perimetro: " + retangulo_01.calcularPerimetro());



    }
}
