import Itens.ArmaPrincipal;
import Itens.ConsumivelCombate;
import Itens.ItemHeroi;
import Itens.Pocao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BibliotecaFuncoesComuns {

//    public static void lerFicheiro() throws FileNotFoundException {
//
//        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
//        Scanner fileScanner = new Scanner(new File("src/Itens/ItensHeroiRPG.csv"));
//
//        String linha;
//        linha = fileScanner.nextLine();
//
//        while (fileScanner.hasNextLine()) {
//            linha = fileScanner.nextLine();
//
//            String [] dividirLinha = linha.split(";");
//
//            String tipo = dividirLinha[0];
//            String nome= dividirLinha[1];
//            int preco = Integer.parseInt(dividirLinha[2]);
//
//            String  heroisPermitidos= dividirLinha[3];
//            heroisPermitidos.replace("[","");
//            heroisPermitidos.replace("]","");
//            String [] heroiPermitidoArray= heroisPermitidos.split(",");
//
//
//            int ataque = Integer.parseInt(dividirLinha[4]);
//            int ataqueEspecial = Integer.parseInt(dividirLinha[5]);
//            int ataqueInstantaneo = Integer.parseInt(dividirLinha[6]);
//            int vida = Integer.parseInt(dividirLinha[7]);
//            int forca= Integer.parseInt(dividirLinha[8]);
//
//
//            if (tipo.equals("ArmaPrincipal")){
//
//                ItemHeroi itemHeroiAtual = new ArmaPrincipal();
//
////                for (String heroiPermitidoAtual: heroiPermitidoArray){
////
////                    itemHeroiAtual.add(heroiPermitidoAtual);
////
////                }
//            }
//            if (tipo.equals("ConsumivelCombate")){
//
//                ItemHeroi itemHeroiAtual = new ConsumivelCombate();
//            }
//            if (tipo.equals("Pocao")){
//
//                ItemHeroi itemHeroiAtual = new Pocao();
//            }
//
//
//        }
//
//
//
//    }
}
