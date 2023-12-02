package Ex_04_FormaGeometrica;

public class Main {

    public static void main(String[] args) {

        //instanciar formas geometricas
       Retangulo retangulo1 = new Retangulo(10,5);

       Triangulo triangulo1 = new Triangulo(5,10);

       Circulo circulo1 = new Circulo(5);

       //áreas

        System.out.println("\nÁreas das Formas Geométricas: ***********************\n");
        retangulo1.calcularArea();
        System.out.println();

        triangulo1.calcularArea();
        System.out.println();

        circulo1.calcularArea();



    }
}
