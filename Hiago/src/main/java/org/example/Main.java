package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        ArrayList<Onibus> onibus = new ArrayList<Onibus>();
        veiculos.add(new Veiculo("XPO-O987", 2010));

        for(Veiculo veiculo : veiculos){
            veiculo.exibirDados();
        }

    }
}