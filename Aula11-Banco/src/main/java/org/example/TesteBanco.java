package org.example;
public class TesteBanco {
    public static void main(String[] args) {
        TesteBanco testeBanco = new TesteBanco();
        Banco banco = new Banco();

        System.out.println("----------------------- CRIAÇÃO DE CONTAS BANCÁRIAS -------------------------");

        // Criação do primeiro cliente Bruno Henrique e sua respectiva conta com saldo inicial
        Cliente brunoHenrique = new Cliente("Bruno", "Henrique");
        ContaPoupanca contaBH = new ContaPoupanca(50000.0, 0.03);
        brunoHenrique.setConta(contaBH);
        banco.adicionarCliente(brunoHenrique);
        System.out.println("Criando uma conta poupança para o cliente " + banco.getCliente(0) + "com saldo de R$ " + contaBH.saldo + " com rendimento de 3%.");

        // Demonstração do comportamento dos vários tipos de conta
        System.out.println("------------------ RELATÓRIO DE TRANSAÇÕES -------------------\n");
        // Testando uma conta poupança
        System.out.println("Recuperando o cliente Bruno Henrique");
        Cliente cliente = banco.getCliente(0);
        Conta conta = cliente.getConta();
        // Executa algumas transações na conta
        System.out.println("Sacando R$ 1.200,00: " + conta.sacar(1200));
        System.out.println("Depositando R$ 8.525,00: " + conta.depositar(8525));
        System.out.println("Sacando R$ 12.800,00: " + conta.sacar(12800) );
        System.out.println("Sacando R$ 50.000,00: " + conta.sacar(50000) );
        testeBanco.exibirSaldo(cliente);
    }
    public void exibirSaldo(Cliente cliente) {
        System.out.println("Cliente [" + cliente.getNome()
                + ", " + cliente.getSobrenome()
                + "] tem o saldo de R$ " + cliente.getConta().getSaldo());
        System.out.println();
    }
}



//        // Criação do primeiro cliente Everton Ribeiro e sua respectiva conta com saldo inicial
//        Cliente evertonRibeiro = new Cliente("Everton", "Ribeiro");
//        Conta contaER = new Conta(45000.0);
//        evertonRibeiro.setConta(contaER);
//
//        // Criação do primeiro cliente Filipe Luis e sua respectiva conta com saldo inicial
//        Cliente filipeLuis = new Cliente("Filipe", "Luis");
//        Conta contaFilipeLuis = new Conta(70000.0);
//        filipeLuis.setConta(contaFilipeLuis);
//
//        // Criação do primeiro cliente e sua respectiva conta com saldo inicial
//        Cliente gabrielBarbosa = new Cliente("Gabriel", "Barbosa");
//        Conta contaGB = new Conta(220000.0);
//        gabrielBarbosa.setConta(contaGB);
//
//        // Criação do primeiro cliente e sua respectiva conta com saldo inicial
//        Cliente diegoAlves = new Cliente("Diego", "Alves");
//        Conta contaDA = new Conta(50000.0);
//        diegoAlves.setConta(contaDA);
//
//        banco.adicionarCliente(brunoHenrique);
//        banco.adicionarCliente(evertonRibeiro);
//        banco.adicionarCliente(filipeLuis);
//        banco.adicionarCliente(gabrielBarbosa);
//        banco.adicionarCliente(diegoAlves);
//        // Tendo em vista que nossa array tem tamanho 5, tentar inserir
//        // mais um cliente vai causar um erro em tempo de execução.
//        // banco.adicionarCliente("Diego", "Ribas");
//
//        for (int i = 0; i < banco.getNumeroDeClientes(); i++) {
//            Cliente cliente = banco.getCliente(i);
//            Conta conta = cliente.getConta();
//
//            String temp = "Cliente [" + (i + 1) + "] : " +
//                    cliente.getNome() + " " +
//                    cliente.getSobrenome() + "." +
//                    " Saldo R$:" + conta.getSaldo();
//            System.out.println(temp);
//        }