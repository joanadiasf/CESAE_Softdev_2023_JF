package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {

    public static void main(String[] args) {

        // Instanciar o Scanner obrigatório para todos os exercicios)
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double cargo,iliquido,subali,irs,ss1,ss2,liquido;
        int codfun,diastrab;

        //ler info
        System.out.println("Insirir código de funcionário");
        codfun = input.nextInt();

        System.out.println("Dias trabalhados");
        diastrab = input.nextInt();

        System.out.println("Selecione cargo:     E-Empregado     C-Chefe     A-Administrador");
        cargo = input.nextDouble();



        switch (cargo){

            case "E":
                subali= diastrab * 5;
                iliquido= (40 * diastrab);
                irs= (iliquido * 0.1);
                ss1= (iliquido * 0.11);
                ss2= (iliquido * 0.2375);
                liquido= ((iliquido + subali) - irs) - ss1 ;

                System.out.println("Funcionário(a)" + codfun);
                System.out.println("Cargo: " + cargo);
                System.out.println("Valor ilíquido: " + iliquido);
                System.out.println("Subsídio de alimentação: " + subali);
                System.out.println("IRS: " + irs);
                System.out.println("A pagar à Segurança Social (funcionário): " + ss1);
                System.out.println("A pagar à Segurança Social (empresa): " + ss2);
                System.out.println("Valor líquido: " + liquido);
                break;

            case "C":
                subali= diastrab * 7.5;
                iliquido= (60 * diastrab);
                irs= (iliquido * 0.2);
                ss1= (iliquido * 0.11);
                ss2= (iliquido * 0.2375);
                liquido= ((iliquido + subali) - irs) - ss1 ;

                System.out.println("Funcionário(a)" + codfun);
                System.out.println("Cargo: " + cargo);
                System.out.println("Valor ilíquido: " + iliquido);
                System.out.println("Subsídio de alimentação: " + subali);
                System.out.println("IRS: " + irs);
                System.out.println("A pagar à Segurança Social (funcionário): " + ss1);
                System.out.println("A pagar à Segurança Social (empresa): " + ss2);
                System.out.println("Valor líquido: " + liquido);
                break;

            case "A":
                subali= diastrab * 7.5;
                iliquido= (80 * diastrab);
                irs= (iliquido * 0.2);
                ss1= (iliquido * 0.11);
                ss2= (iliquido * 0.2375);
                liquido= ((iliquido + subali) - irs) - ss1 ;

                System.out.println("Funcionário(a)" + codfun);
                System.out.println("Cargo: " + cargo);
                System.out.println("Valor ilíquido: " + iliquido);
                System.out.println("Subsídio de alimentação: " + subali);
                System.out.println("IRS: " + irs);
                System.out.println("A pagar à Segurança Social (funcionário): " + ss1);
                System.out.println("A pagar à Segurança Social (empresa): " + ss2);
                System.out.println("Valor líquido: " + liquido);
                break;

            default:
                System.out.println("Cargo inválido");

        }
//        //Calculos
//        subali= diastrab * 5;
//        iliquido= (40 * diastrab);
//        irs= (iliquido * 0.1);
//        ss1= (iliquido * 0.11);
//        ss2= (iliquido * 0.2375);
//        liquido= ((iliquido + subali) - irs) - ss1 ;
//
//
//
    }
}
