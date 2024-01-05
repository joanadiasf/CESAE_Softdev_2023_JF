package Ex_08;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Luana",16,"Economia",14.5);

        Aluno aluno2 = new Aluno("Dinis",16,"Economia",7.2);


        System.out.println("O aluno1 está...");
        aluno1.situacao();

        System.out.println();

        System.out.println("O aluno2 está...");
        aluno2.situacao();
    }
}
