package Ex_07;

public class Livro {

    private String nome;
    private String autor;
    private String categoria;
    private int nrPaginas;
    private int isbn;


    public Livro(String nome, String autor, String categoria, int nrPaginas, int isbn) {
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;
        this.nrPaginas = nrPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes(){

        System.out.println("\nNome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Número de Páginas: " + nrPaginas);
        System.out.println("ISBN: " + isbn);
    }
}
