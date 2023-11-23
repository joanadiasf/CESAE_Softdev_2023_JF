package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    //ArrayList <tipo de dados> nome = new ArrayList <>();
    ArrayList <Musica> programacao = new ArrayList<>();

    //construtor
    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }

    /**
     * Método para adicionar músicas no ArrayList
     * @param musicaNova - música a ser adicionada
     */
    public void addMusica(Musica musicaNova){

        programacao.add(musicaNova);

    }

    /**
     * Método para trocar uma música no ArrayList (editar elemento)
     */
    public void trocaMusica(int posicao1, int posicao2){

        Musica musica1= this.programacao.get(posicao1);
        Musica musica2 = this.programacao.get(posicao2);

        this.programacao.set(posicao1,musica2);
        this.programacao.set(posicao2,musica1);
    }

    //remover por index
    public void removeMusica(int posicao){

        programacao.remove(posicao);
    }

    //remover por musica
    public void removeMusica(Musica musica){

        programacao.remove(musica);
    }


    public void removeTodasMusicas(){

        programacao.clear();
    }

    public void imprimirRelatorio(){

        for (Musica music : this.programacao){

            System.out.print("Música " + this.programacao.indexOf(music) + " | " );
            music.imprimirDetalhes();
        }


    }



}
