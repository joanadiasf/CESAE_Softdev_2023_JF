package Ex_02;

public class Main {

    public static void main(String[] args) {

        Conta zezinho = new Conta(123,1000,"Zezinho");
        Conta patinhas = new Conta(234,4000,"Tio Patinhas");


        System.out.println(zezinho.getMargemEmprestimo());
        System.out.println(patinhas.getMargemEmprestimo());


        zezinho.pedirEmprestimo(900);

        if (zezinho.pedirEmprestimo(900)){

            System.out.println("Emprestimo feito com sucesso!");
            System.out.println(patinhas.getSaldo());

        }else {

            System.out.println("Não é possivel fazer emprestimo...");
        }



        patinhas.pedirEmprestimo(5000);
        if (patinhas.pedirEmprestimo(5000)){

            System.out.println("Emprestimo feito com sucesso!");
            System.out.println(patinhas.getSaldo());

        }else {

            System.out.println("Não é possivel fazer emprestimo...");
        }



    }
}
