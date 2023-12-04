package Ex_01;

public class FigurasGeometricasDemo {

    public static void main(String[] args) {


        Retangulo retangulo = new Retangulo("Preto",200,10);

        Circulo circulo = new Circulo("Amarelo",10);

        Triangulo triangulo = new Triangulo("Azul",10,5);

        GestorTerrenos gt = new GestorTerrenos("Zequinha");

        gt.addTerreno(retangulo);
        gt.addTerreno(circulo);
        gt.addTerreno(triangulo);

        System.out.println("Área Total dos Terreno do " + gt.getProprietario() + ": " + gt.calcularTerrenos());
    }

}
