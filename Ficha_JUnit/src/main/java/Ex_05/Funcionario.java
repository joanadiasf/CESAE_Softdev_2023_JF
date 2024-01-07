package Ex_05;

public class Funcionario {

    // Atributos de instancia
    private String nome, departamento;
    private double salario;

    public Funcionario(String nome, double salario, String departamento){
        this.nome=nome;
        this.salario=salario;
        this.departamento=departamento;
    }

    /**
     * Metodo para aumentar o salario
     * @param aumento - Recebe um valor percentual
     */
    public double aumentarSalario(double aumento){
        this.salario*=(1+(aumento/100));

        return this.salario;
    }

   // public void exibirDados(){
   //    System.out.println("Nome: "+this.nome);
   //  System.out.println("Salario: "+this.salario);
   //System.out.println("Departamento: "+this.departamento);
   //}

    public String exibirDetalhes(){

        return "Nome: " + this.nome + "\nSalario: "+ this.salario + "\nDepartamento: " + this.departamento;
    }
}
