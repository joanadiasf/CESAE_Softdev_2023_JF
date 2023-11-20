package Ex_09;

public class Produto {

    private String nome;
    private double preco;
    private int stock=0;

    /**
     * Construtor
     * @param nome - nome
     * @param preco - preço (€)
     * @param stock - stock
     */
    public Produto(String nome, double preco, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void comprar(int num){

        stock+=num;

        System.out.println("Comprou " + num + " unidades.");
    }

    public int getStock() {
        return stock;
    }

    public void vender(int num){

        stock-=num;

        if (stock>=0){

            System.out.println("Vendeu " + num + " unidades.");
        }else {
            System.out.println("Quebra do stock...");
            System.out.println("Tentou vender " + num + " unidades");
        }


    }
}
