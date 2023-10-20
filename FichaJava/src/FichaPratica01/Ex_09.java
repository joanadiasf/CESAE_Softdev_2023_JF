package FichaPratica01;

import java.util.Scanner;
public class Ex_09 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double codfun,diastrab,iliquido,subali,irs,ss,liquido;

        //ler info
        System.out.println("Insirir código de funcionário");
        codfun= input.nextDouble();

        System.out.println("Dias trabalhados");
        diastrab= input.nextDouble();

        //Calcular
        subali= diastrab * 5;
        iliquido= (40 * diastrab) + subali;
        irs= (iliquido * 0.1);
        ss= (iliquido * 0.11) + (iliquido * 0.2375);
        liquido= (iliquido - irs) - ss;


        //Apresentar resultados
        System.out.println("Valor ilíquido: " + iliquido);
        System.out.println("Subsídio de alimentação: " + subali);
        System.out.println("IRS: " + irs);
        System.out.println("A pagar à Segurança Social: " + ss);
        System.out.println("Valor líquido: " + liquido);


    }
}
