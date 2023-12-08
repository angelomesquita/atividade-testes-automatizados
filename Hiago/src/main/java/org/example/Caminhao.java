package org.example;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos(){
        return eixos;
    }

    public void setEixos(int eixos){
        // eixo simples 1, eixo duplo 2;
        if(eixos >= 1 && eixos < 3){
            this.eixos = eixos;
        } else{
            throw new IllegalArgumentException("Os modelos disponíveis no momento são de eixo simples e eixo duplo");
        }

    }
    public void exibirDados(){
        System.out.println("A placa do veículo é " + placa + " e o ano de fabricação é" + ano + "quantidade de eixos é" + eixos);
    }

    @Override
    public void setAno(int ano){
        if(ano > 1998){
            this.ano = ano;
        } else{
            throw new IllegalArgumentException("Modelo obsoleto, cadastre um caminhão de modelo mais recente");
        }

    }
}
