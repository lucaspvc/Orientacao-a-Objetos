package org.example;

public class ContaPoupanca extends Conta{
    private Double taxaRendimento;
    public ContaPoupanca(Double saldoInicial, Double rendimento){
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }
}
