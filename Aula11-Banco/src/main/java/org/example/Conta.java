package org.example;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Conta {
    protected double saldo;
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
    public boolean depositar(double valor){
        saldo = saldo + valor;
        return true;
    }
    public boolean sacar(double valor){
        if((this.saldo - valor) >= 0) {
            saldo = saldo - valor;
            return true;
        } else{
            return false;
        }
    }
}
