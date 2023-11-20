package Ex_11;

public class Conta {

    private int numeroConta;
    private double saldo;
    private String titularConta;

    /**
     * Construtor
     * @param numeroConta - número da conta
     * @param saldo - saldo
     * @param titularConta - nome do titular da conta
     */
    public Conta(int numeroConta, double saldo, String titularConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titularConta = titularConta;
    }

    public void transferencia(double valor, Conta contaDestino){


        if (valor <=this.saldo){

            this.saldo-=valor;

            //para o deposito ser feito
            contaDestino.depositar(valor);

            System.out.println("Transferência feita");
        }else {

            System.out.println("Saldo insuficiente.... ");
        }

    }

    public void depositar(double valor){

        this.saldo+=valor;
    }

    public void levantar (double valor){

        if (valor <= this.saldo){

            this.saldo-=valor;

            System.out.println("Levantamento concluido");
        }else {

            System.out.println("Saldo insuficiente...");
        }

    }

    public void exibirSaldo(){

        System.out.println("Saldo da conta " + this.numeroConta + " : " + this.saldo + "€.");
    }
}
