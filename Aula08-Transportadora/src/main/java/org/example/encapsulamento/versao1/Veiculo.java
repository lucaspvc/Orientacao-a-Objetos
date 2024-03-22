package org.example.encapsulamento.versao1;

public class Veiculo {
    public double carga;
    public double cargaMaxima;
    public Veiculo(double carga, double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
        this.carga = carga;
    }
    public double getCarga(){
        return carga;
    }
    public double getCargaMaxima(){
        return cargaMaxima;
    }
    public void addCaixa(double peso){
        this.carga = this.carga + peso;
    }
}
