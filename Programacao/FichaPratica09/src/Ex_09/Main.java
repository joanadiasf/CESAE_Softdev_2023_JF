package Ex_09;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("esponja", 3.5,0);

        System.out.println();
        produto1.comprar(5);

        System.out.println();
        produto1.vender(2);

        System.out.println();
        System.out.println("Stock Atual:" + produto1.getStock());

        System.out.println();
        produto1.comprar(10);

        System.out.println();
        produto1.vender(35);


    }
}
