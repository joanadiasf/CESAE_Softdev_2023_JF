package Ex_04;

public class Main {
    public static void main(String[] args) {


        //Instanciar um circulo
        Circulo circulo1 = new Circulo(3);

        //Calcular
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Circunferência: " + circulo1.calcularCircunferencia());
    }
}
