package FichaPraticaExtraCiclos;

import java.util.Scanner;
public class Ex_05 {

    public static void main(String[] args) {

        //declarar variaveis
        int num,linha,simetria,coluna;
        String strg;

        //5.1

        num=1;
        linha=1;
        strg = "";

        for (linha=1;linha<=5;linha++){

            for (num=1;num<=linha;num++){

                strg += linha + " ";

                if (num == linha){

                    strg += "\n";
                }

            }

        }
        System.out.println(strg);


        System.out.println("\n");


        //5.2

        simetria=0;
        num =1;
        linha =1;
        strg = "";

        //1for - numero de linhas
        // 2for - por espaços na coluna
        // if - simetria para achar o meio da piramide
        //mudar de linha e simetria++ para acrescentar * apartir do meio

            for (linha=1;linha<=5;linha++){

                for (coluna=1; coluna <=9; coluna++){

                    strg += " ";

                    if (coluna+simetria==5){

                        for (coluna=5-simetria; coluna<=5+simetria;coluna++){

                            strg += num;
                        }
                    }
                }

                num++;

                //muda de linha
                strg += "\n";
                simetria++;

            }
        System.out.println(strg);


         //5.3

        simetria=0;
        num =1;
        linha =1;
        strg = "";

        //1for - numero de linhas
        // 2for - por espaços na coluna
        // if - simetria para achar o meio da piramide
        //mudar de linha e simetria++ para acrescentar * apartir do meio

        for (linha=1;linha<=5;linha++){

            for (coluna=1; coluna <=9; coluna++){

                strg += " ";
////////////////////////////////////////////////
                if (coluna+simetria==5){

                    for (coluna=5-simetria; coluna<=5+simetria;coluna++){

                        strg += num;
                    }
                }
            }

            num++;

            //muda de linha
            strg += "\n";
            simetria++;

        }
        System.out.println(strg);
    }
}
