package Ex_06;

public class Competicao {

    private String nome;
    private String pais;
    private Atleta[] participante;

    //construtor
    //dar nr que achamos q nao vai ser atingido (ex100)
    public Competicao() {
        this.participante = new Atleta[50];
    }

    /**
     * Método para adicionar novos participantes
     * @param atletaNovo - novo participante
     */
    public void addAtletas(Atleta atletaNovo){

        //percorrer o vetor
        for (int i=0; i < this.participante.length;i++){

            //se o elemento do vetor estiver vazio
            if (this.participante[i]==null){

                this.participante[i] = atletaNovo;
                return;

            }
        }
    }

    /**
     * Método para fazer a listagem dos participantes
     */
    public void listaAtletas(){

        //percorrer o vetor
        for (int i=0;i < this.participante.length;i++){

            if (this.participante[i]!=null){

                System.out.println();
                this.participante[i].exibirDetalhes();
            }
        }
    }


}
