package Ex_02;

public class Main {

    public static void main(String[] args) {

        //criar 5pessoas(uma com menos de 18 anos)
        Pessoa ze = new Pessoa("Zé",65,"910 023 234", "srjose@gmail.com");
        Pessoa miguel = new Pessoa("Miguel",16,"932 245 432","oreidelas@gmail.com");
        Pessoa maria = new Pessoa("Maria",42,"912 567 543","mariaj@gmail.com");
        Pessoa fatima = new Pessoa("Fatima",53,"965 312 987","fatinha@gmail.com");
        Pessoa vitor = new Pessoa("Vitor",24,"967 543 647","vitorsoftdev@gmail.com");

        //criar array
        Sorteio sorteio = new Sorteio(12222);

        //add ao array
        sorteio.addParticipante(ze);
        sorteio.addParticipante(miguel);
        sorteio.addParticipante(maria);
        sorteio.addParticipante(fatima);
        sorteio.addParticipante(vitor);


        //imprimir participantes
        sorteio.imprimirParticipantes();

        //imprimir vencedor
        System.out.println("VENCEDOR***********************");
        Pessoa vencedor= sorteio.vencedorSorteio();
        vencedor.exibirDetalhes();

        //sout vencedor
        //nome.vencedorsorteio().exibirDados
    }
}
