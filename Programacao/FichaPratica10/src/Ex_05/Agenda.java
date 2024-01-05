package Ex_05;

public class Agenda {

    //array de pessoas
    private Pessoa[] agenda;

    //construtor
    //dar nr que achamos q nao vai ser atingido (ex100)
    public Agenda() {
        this.agenda = new Pessoa[50];
    }

    /**
     * Método para adicionar uma pessoa nova à agenda
     * @param pessoaNova - pessoa a ser adicionada
     */
    public void addPessoa(Pessoa pessoaNova){

        //percorrer o vetor
        for (int i=0; i < this.agenda.length;i++){

            //se o elemento do vetor estiver vazio
            if (this.agenda[i]==null){

                this.agenda[i] = pessoaNova;
                return;

            }
        }
    }

public void listaPessoa(){

        //percorrer o vetor
    for (int i=0;i < this.agenda.length;i++){

        if (this.agenda[i]!=null){

            System.out.println();
            this.agenda[i].exibirDetalhes();
        }
    }
}





















    //metodo void addPessoa(Pessoa pessoaNova)
    //for int i=0; i < this.agenda.length;i++
    //if this.agenda[i]==null
    //this.agenda[i] = pessoaNova
    //return(p/ fechar logo a funçao / se fosse um break era so aquele bloco)

        //listar agenda
    //for int i=0; i < this.agenda.length;i++
    //if this.agenda[i]==null
    //this.agenda[i].exibirDetalhes()


}
