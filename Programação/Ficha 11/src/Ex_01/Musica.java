package Ex_01;

public class Musica {

    private String titulo;
    private String genero;
    private String artista;
    private int duracaoSegundos;

    /**
     * Construtor
     * @param titulo - titulo
     * @param genero - genero
     * @param artista - artista
     * @param duracaoSegundos - duração da música em segundos
     */
    public Musica(String titulo, String genero, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

   public  void  imprimirDetalhes(){

       System.out.println( this.titulo + " | " + this.genero + " | " + this.artista + " | " + this.duracaoSegundos);

   }
}
