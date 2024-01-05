package Ex_07;

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Demian","Herman Hesse","Biográfico",300,4567345);
        Livro livro2 = new Livro("Pride and Prejudice", "Jane Austen", "Romance",200,1243567);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}
