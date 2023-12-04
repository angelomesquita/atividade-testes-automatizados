package org.example;

public class ContaBancaria {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void despositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException(" O valor do deposito deve ser maior que zero");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            throw new IllegalArgumentException("Valor Inválido");
        }
    }
}