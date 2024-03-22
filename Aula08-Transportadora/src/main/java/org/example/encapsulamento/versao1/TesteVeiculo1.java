package org.example.encapsulamento.versao1;

public class TesteVeiculo1 {
    public static void main(String[]args){
        Veiculo veiculo1 = new Veiculo(0, 10000);
        System.out.println("Veículo 1 criado, carga máxima "+ veiculo1.getCargaMaxima());
        veiculo1.addCaixa(100);
        System.out.println("Adicionando Caixa de carga: 100");
        veiculo1.addCaixa(150);
        System.out.println("Adicionando Caixa de carga: 150");
        veiculo1.addCaixa(200);
        System.out.println("Adicionando Caixa de carga: 200" );
    }
}
