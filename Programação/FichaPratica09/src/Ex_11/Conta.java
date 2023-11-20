package Ex_11;

import java.util.Scanner;

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

    public void transferencia(double valor, int numeroConta2){

        Scanner input = new Scanner(System.in);

        int contaTransferencia;

        System.out.print("De que conta quer transferir? ");
        contaTransferencia = input.nextInt();

        if (contaTransferencia==this.numeroConta){

            this.saldo-=valor;
        }
    }
}
