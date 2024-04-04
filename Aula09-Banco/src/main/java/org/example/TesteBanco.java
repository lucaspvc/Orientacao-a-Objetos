package org.example;

public class TesteBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Bruno","Henrique");
        System.out.println("Criando o cliente " + cliente.getNome());
        System.out.println("Criando uma conta com R% 50.000,00 para o cliente " + Cliente.class.getName());

    }
}