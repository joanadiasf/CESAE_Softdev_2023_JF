package Ex_11;

public class Main {

    public static void main(String[] args) {

        Conta conta123 = new Conta(123,0,"Zezeca Marinha");
        Conta conta456 = new Conta(456,100,"José Castelo Branco");
        Conta conta789 = new Conta(789,9000,"Sirius Black");


        conta123.depositar(1000);
        conta123.levantar(120);

        conta123.exibirSaldo();
        System.out.println();

        conta789.transferencia(11,conta456);
        conta456.exibirSaldo();
        System.out.println();

        conta789.exibirSaldo();
    }
}
