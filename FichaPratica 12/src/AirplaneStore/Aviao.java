package AirplaneStore;

public class Aviao {

    private int serial;
    private  String modelo;
    private int anoFabrico;
    private double peso;
    private double comprimentoFuselagem;
    private double asas;
    private double cauda;
    private int nrmotores;
    private double autonomia;
    private double velocidadeMax;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public Aviao(int serial, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double asas, double cauda, int nrmotores, double autonomia, double velocidadeMax, double preco) {
        this.serial = serial;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.comprimentoFuselagem = comprimentoFuselagem;
        this.asas = asas;
        this.cauda = cauda;
        this.nrmotores = nrmotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }
}
