package Ex_02;

public class Main {
    public static void main(String[] args) {

        //Instanciar 3 caes
        Cao filo = new Cao("Filo","Labrador","Au au");
        Cao bobby = new Cao("Bobby","Pastor Alemão", "AU AU AU");
        Cao sirius = new Cao("Sirius","Rottweiller","Ruff ruff!");

        //Imprimir detalhes primeiro cão
        System.out.println("Nome: " + filo.getNome());
        System.out.println("Raça: " + filo.getRaca());
        System.out.println("Nome: " + filo.getLatido());

        //Imprimir detalhes segundo cão
        System.out.println("\nNome: " + bobby.getNome());
        System.out.println("Raça: " + bobby.getRaca());
        System.out.println("Nome: " + bobby.getLatido());

        //Imprimir detalhes terceiro cão
        System.out.println("\nNome: " + sirius.getNome());
        System.out.println("Raça: " + sirius.getRaca());
        System.out.println("Nome: " + sirius.getLatido());
    }
}
