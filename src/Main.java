public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mateus", "123.456.789-00");
        Cliente cliente2 = new Cliente("João", "987.654.321-00");

        ContaBancaria contaCorrente = new ContaCorrente(1001, cliente1);
        ContaBancaria contaPoupanca = new ContaPoupanca(2001, cliente2);

        contaCorrente.depositar(500.00);
        contaPoupanca.depositar(300.00);

        contaCorrente.sacar(100.00);
        contaCorrente.transferir(contaPoupanca, 200.00);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + contaPoupanca.getSaldo());
    }
}