package Ex_02;

import Ex_01.Musica;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    //ArrayList <tipo de dados> nome = new ArrayList <>();
    ArrayList<Pessoa> participantes = new ArrayList<>();

    //construtor
    public Sorteio() {
        this.participantes = new ArrayList<>();

    }

    //adicionar pessoas

    /**
     * Método para adicionar novo participante
     * @param novo - novo participante
     */
    public void addParticipante(Pessoa novo){

        participantes.add(novo);
    }

    public boolean verificaIdade(Pessoa pessoa){


        if (pessoa.getIdade() < 18){

            return false;
        }
        else {

            return true;
        }

    }


    public void vencedorSorteio(){

        Random random = new Random();

        int variavelAleatoria = random.nextInt(1,5);

        String vencedor = "Vencedor é o participante" + variavelAleatoria;

        for (Pessoa vencedora : this.participantes){

            if (variavelAleatoria==this.participantes.indexOf(vencedora)){

                vencedora.exibirDetalhes();
            }


        }


    }


}
