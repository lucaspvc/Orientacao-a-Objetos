package org.example;

public class TestePonto {
    public static void main(String[] args) {
        Ponto primeiroponto = new Ponto(200,200);
        Ponto segundoponto = new Ponto(400,230);
        System.out.println("Coordenadas do primeiro ponto (x,y):" + primeiroponto.getX() + "," + primeiroponto.getY());
        System.out.println("Coordenadas do segundo ponto (x,y):" + segundoponto.getX() + "," + segundoponto.getY());
        System.out.println(" ");
        Ponto outraRefSegundoPonto = segundoponto;
        System.out.println("Criação de uma referência para o segundo ponto, chamada outraRefSegundoPonto (x,y)" );
        System.out.println(" ");
        System.out.println("Exibindo o contéudo de todas as referências");
        System.out.println(" ");
        System.out.println("Coordenadas do primeiro ponto (x,y):" + primeiroponto.getX() + "," + primeiroponto.getY());
        System.out.println("Coordenadas do segundo ponto (x,y):" + segundoponto.getX() + "," + segundoponto.getY());
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y):" +
                outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY());
        System.out.println(" ");
        System.out.println("Alterando as coordenadas do segundo ponto para (840,350)");
        System.out.println(" ");
        segundoponto.setX(840);
        segundoponto.setY(350);
        System.out.println("Coordenadas do primeiro ponto (x,y):" + primeiroponto.getX() + "," + primeiroponto.getY());
        System.out.println("Coordenadas do segundo ponto (x,y):" + segundoponto.getX() + "," + segundoponto.getY());
        System.out.println("Coordenadas do objeto apontado pela referência outraRefSegundoPonto (x,y):" +
                outraRefSegundoPonto.getX() + "," + outraRefSegundoPonto.getY());
    }
}