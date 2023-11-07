package FichaPratica06;

public class Ex_03 {

//a
    /**
     * Avalia se um nr é par ou imar
     * @param num - nr a ser avaliado
     * @return true - se par || false - se impar
     */
    public static boolean par(int num){

        if (num%2==0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * avalia se um nr é positivo ou negativo
     * @param num - nr a ser avaliado
     * @return true- positivo || false - negativo
     */
    public static boolean positivo (int num){

            if (num>0){
                return true;
            }else {
                return false;
            }
    }


    /**
     * avalia se um nr é ou não primo
     * @param num -nr a ser avaliado
     * @return true - primo || false-nao primo
     */
    public static boolean primo (int num){

        for (int divisor=2; divisor <num; divisor++){

            if (num%divisor==0){
                return false;
            }

        }
        return true;
    }


    /**
     * avalia se o nr é perfeito ou não
     * @param num - nr a ser avaliado
     * @return true - nr perfeito || false - nr não perfeito
     */
    public static boolean perfeito (int num){

        int somaDivisor=0;

        for ( int divisor=1; divisor <num; divisor++){

            if (num%divisor==0){
                somaDivisor=somaDivisor+divisor;
            }
        }

        if (num == somaDivisor){

            return true;
        }else {
            return false;
        }

    }




}