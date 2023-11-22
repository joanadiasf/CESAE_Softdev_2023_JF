package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {

    //ArrayList <tipo de dados> nome = new ArrayList <>();
    ArrayList <Musica> programacao = new ArrayList<>();


    /**
     * Método para adicionar músicas no ArrayList
     * @param musicaNova - música a ser adicionada
     */
    public void addMusica(Musica musicaNova){

        programacao.add(musicaNova);

    }

    /**
     * Método para trocar uma música no ArrayList (editar elemento)
     * @param troca - música nova
     * @param posicao - indice do ArrayList
     */
    public void trocaMusica(Musica troca, int posicao){

        programacao.set(posicao,troca);
    }

    public void removeMusica(int posicao){

        programacao.remove(posicao);
    }

    public void removeTodasMusicas(){

        programacao.clear();
    }

    public void imprimirRelatório(){

        for (Musica music : this.programacao){

            System.out.print("Música " + this.programacao.indexOf(music) + " | " );
            music.imprimirDetalhes();
        }


    }



}
