package Ex_04;

public class Retangulo {

        // Definir os atributos
        private double largura;
        private double altura;


        // Método construtor
        public Retangulo(double largura, double altura){
            this.largura=largura;
            this.altura=altura;
        }

        /**
         * Método que calcula o perimetro do retangulo
         * @return Perimetro do retangulo
         */
        public double calcularPerimetro(){
            double perimetro= (this.largura*2)+(this.altura*2);
            return perimetro;
        }

        /**
         * Método que calcula a area do retangulo
         * @return area do retangulo
         */
        public double calcularArea(){
            return this.largura*this.altura;
        }


}
