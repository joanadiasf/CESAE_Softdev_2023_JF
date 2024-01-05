package Ex_10;

public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;

    /**
     * Construtor
     * @param nome - nome
     * @param salario - salário (€)
     * @param departamento - departamento
     */
    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }


    public void exibirDados(){

        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double valor){

        this.salario=this.salario + (this.salario*valor);


    }
}
