package FichaPratica06;

public class Ex_05_BibliotecaEx06 {


    /**
     * Método para descobrir qual o maior elemento do vetor
     * @param vetor - para se saber o tamanho do vetor
     * @return - o maior elemento dentro do vetor
     */
    public static int maiorVetor(int[]vetor){

        int nummaior;

        nummaior = vetor[0];

        for ( int i=1; i < vetor.length; i++){

            if (nummaior < vetor[i]){

                nummaior = vetor[i];

            }

        }

        return nummaior;

    }


    /**
     * Método para descobrir qual o menor elemento do vetor
     * @param vetor - para se saber o tamanho do vetor
     * @return - o menor elemento dentro do vetor
     */
    public static int menorVetor(int[]vetor){

        int nummenor;

        nummenor = vetor[0];

        for ( int i=1; i < vetor.length; i++){

            if (nummenor > vetor[i]){

                nummenor = vetor[i];

            }

        }

        return nummenor;

    }


    /**
     * Método para descobrir que os elementos dentro do vetor estão em ordem crescente
     * @param vetor - para se saber o tamanho do vetor
     * @return - se o vetor está em ordem crescente ou não
     */
    public static boolean crescenteVetor(int []vetor){

        boolean crescente=true;

        for (int i=0; i < vetor.length; i++){

            if (vetor[i] < vetor[i - 1]){

                crescente= false;
                break;
            }

        }
        if (crescente){
            return true;
        }else {
            return false;
        }
    }



}
