package Ex_03;

public class Animal {

    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[]alimentacao;

    /**
     * Construtor
     * @param nome - nome
     * @param especie - especie
     * @param paisOrigem - pais de origem
     * @param peso - peso (kg)
     * @param alimentacao - alimentaçao
     */
    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(double pesoAlimento, String alimento){

        pesoAlimento/=1000;

        for (int i=0; i < this.alimentacao.length;i++){

            if (alimento.equals(this.alimentacao[i])){

                System.out.println("O " + this.nome + " comeu a comida");
                System.out.println();


                System.out.println("⠀⠀⠀⠀⠀⠀⠀ ⠀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀");
                System.out.println("⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀");
                System.out.println("⣴⣦⣼⣿⠿⠛⠉⠛⠻⢿⣿⣿⡿⠟⠛⠉⠛⢿⣿⣧⣴⣦");
                System.out.println("⣿⣿⣿⡏⠀⠀⠀⢀⣤⡀⠀⠀⢀⣤⡀⠀⠀⠀⢹⣿⣿⣿");
                System.out.println("⣿⣿⣿⣧⡀⠀⠀⠻⠿⠇⠀⠀⠸⠿⠟⠀⠀⢀⣼⣿⣿⣿");
                System.out.println("⢀⣿⣿⣿⣿⣶⣤⣤⠄⠀⠀⠀⠀⠠⣤⣤⣶⣿⣿⣿⣿⡄");
                System.out.println("⣾⣿⣿⣿⣿⣿⣿⠋⠀⠀⣀⣀⠀⠀⠙⣿⣿⣿⣿⣿⣿⣷");
                System.out.println("⣿⣿⣿⣿⣿⣿⠏⠀⢰⣿⣿⣿⣿⡆⠀⠹⣿⣿⣿⣿⣿⣿");
                System.out.println("⠻⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⠟");
                System.out.println("⠀⠙⠿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⠿⠋⠀");
                System.out.println("⠀⠀⠀⠈⠙⠻⣿⣿⣶⣤⣤⣤⣤⣶⣿⣿⠟⠛⠁⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠿⠿⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀");





                System.out.println();

                this.peso+=pesoAlimento;
                break;
            }

            //impedir que o programa diga o sout a cada linha que passa
            if (i==this.alimentacao.length-1){

                System.out.println("O " + this.nome + " não comeu a comida...Está furioso");

                System.out.println();
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⣿⣿⢦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⡀⣄⠀⠀⢿⣿⣿⣔⣗⣞⣻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⣠⣿⡪⠁⣣⠀⢸⣿⣿⣿⣿⡟⢿⣇⣀⣀⡀⡠⠐⠒⢦⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⣰⣿⣿⣷⣀⣄⣷⣿⣿⡿⠿⠿⠾⢽⡿⠛⠛⢫⣇⡁⠤⠘⣿⣶⣄⠀⠀");
                System.out.println("⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⢡⠀⠀⠀⠙⣆⢒⣡⣿⣿⣿⣷⣄");
                System.out.println("⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⡀⠀⢀⣠⠴⠚⢁⠒⠦⣤⣿⣿⣿⣿⣿⣿⣿⣿");
                System.out.println("⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⠁⠐⠊⠉⠍⠂⠘⣿⣿⣿⣿⣿⣿⣿⣿");
                System.out.println("⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢀⡠⠤⠶⠤⠀⣿⠻⢿⣿⣿⣿⣿⠃");
                System.out.println("⠈⠻⣿⣿⣿⣿⣿⣿⡿⠻⣿⣿⣿⣿⡇⠀⠀⠀⠀⠘⠀⠀⡇⠀⠀⠀⠈⠉⠁⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣦⣀⠀⢀⣄⢀⣰⣧⣀⠀⠀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⡿⠀⠀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣻⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⢨⣿⣿⣿⣧⣀⡀⠀⠀");
                System.out.println("⠀⠀⠀⠀⠀⠀⡠⡴⠿⢿⠿⣿⠇⢄⡀⠀⠀⠀⠀⠀⠀⢺⣿⣛⠟⣉⡉⠫⠶⠦");
                System.out.println("⠀⠀⠀⠀⠀⠻⠙⢚⡢⢊⣂⠊⠉⠒⠃⠀⠀⠀⠀⠀⠀⠀⠀⠈⢊⠀⠀⠉⠉⠁");






            }
        }



    }

    public double getPeso() {
        return peso;
    }
}
