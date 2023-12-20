package Itens;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class InventarioHerois {

    private  String filePath;


    public void Inventario(ArrayList<ItemHeroi> itemHerois) throws IOException {


        // Criar FileWriter

        FileWriter inventario = new FileWriter("inventarioHeroi.txt");

        // Adicionar
        inventario.append(itemHerois + "\n");

        // Fechar
        inventario.close();

    }

    //para limpar o inventário no fim do jogo
    public void limparConteudoInventario() throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(filePath);

        printWriter.close();

    }
}
