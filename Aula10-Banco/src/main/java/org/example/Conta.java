package org.example;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Conta {
    private Double saldo;
    public Conta(Double saldoInicial){
        this.saldo = saldoInicial;
    }

    public Double getSaldo() {
        return saldo;
    }
    public boolean depositar(Double valor){
        this.saldo = this.saldo + valor;
        return TRUE;
    }
    public boolean sacar(Double valor){
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return TRUE;
        } else{
            return FALSE;
        }
    }
}
