package Ex_01;

public class Main {

    public static void main(String[] args) {

        //Instanciar duas pessoas
        Pessoa vitor = new Pessoa("Vitor S.",24,1.7);
        Pessoa francisca = new Pessoa("Francisca A.",40,1.6);

        //Imprimir os detalhes da primeira pessoa
        System.out.println("Nome: " + vitor.getNome() );
        System.out.println("Idade: " + vitor.getIdade() );
        System.out.println("Altura: " + vitor.getAltura() );

        //Imprimir os detalhes da segunda pessoa
        System.out.println("\nNome: " + francisca.getNome() );
        System.out.println("Idade: " + francisca.getIdade() );
        System.out.println("Altura: " + francisca.getAltura() );


    //*******************************************************************

        vitor.setIdade(25);

        System.out.println("\nNome: " + vitor.getNome() );
        System.out.println("Idade: " + vitor.getIdade() );
        System.out.println("Altura: " + vitor.getAltura() );



        //imprimir dados pessoa mais velha

        if (vitor.getIdade() > francisca.getIdade()){

            System.out.println("\nNome: " + vitor.getNome() );
            System.out.println("Idade: " + vitor.getIdade() );
            System.out.println("Altura: " + vitor.getAltura() );

        }else{

            System.out.println("\nNome: " + francisca.getNome() );
            System.out.println("Idade: " + francisca.getIdade() );
            System.out.println("Altura: " + francisca.getAltura() );
        }
    }
}
