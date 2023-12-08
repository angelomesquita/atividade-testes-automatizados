package org.example;

public class Onibus extends Veiculo{

    private int assentos;

    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos(){
        return assentos;
    }

    public void setAssentos(int assentos){
        if(assentos < 40){
            this.assentos = assentos;
        } else {
            throw new IllegalArgumentException("Não é possível alocar assentos acima do limite por gentileza alocar abaixo de 40");
        }
    }

    @Override
    public void exibirDados(){
        System.out.println("A placa do veículo é" + placa + "e o ano de fabriação é" + ano + ", o número de assentos é " + assentos);
    }
}
