package Ex_02;

import Ex_01.Musica;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    private double premio;
    //ArrayList <tipo de dados> nome = new ArrayList <>();
    ArrayList<Pessoa> participantes = new ArrayList<>();

    //construtor
    public Sorteio(double premio) {
        this.premio=premio;
        this.participantes = new ArrayList<>();

    }

    //adicionar pessoas

    /**
     * Método para adicionar novo participante
     * @param novo - novo participante
     */
    public void addParticipante(Pessoa novo){

        if (novo.getIdade()>= 18){
            this.participantes.add(novo);
        }
        else {
            System.out.println("Recusado... Menor de idade");
        }
    }


    public Pessoa vencedorSorteio(){

        Random random = new Random();

        int variavelAleatoria = random.nextInt(0,this.participantes.size()-1);



        return  this.participantes.get(variavelAleatoria);


    }

    public void imprimirParticipantes(){

        for (Pessoa participante : this.participantes){

            participante.exibirDetalhes();
        }
    }


}
