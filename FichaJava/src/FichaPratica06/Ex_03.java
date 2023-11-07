package FichaPratica06;

public class Ex_03 {


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

}