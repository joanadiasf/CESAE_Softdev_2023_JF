package Ex_04;

public class Circulo {

    private double raio;
    private double pi=3.14;

    /**
     * Método construtor da circunferencia
     * @param raio - raio (cm)
     */
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){

        return this.pi*(this.raio*this.raio);
    }

    public double calcularCircunferencia(){

        return 2*(this.pi*this.raio);
    }
}

//instanciar circulo
//area e circunferencia

