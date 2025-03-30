package exercicios.exercicio9;

import java.text.DecimalFormat;

public class ContaBancaria {
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    public String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        System.out.println("\nDepositado o valor de: " + df.format(valor) + " com sucesso.");
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("\nSacado o valor de: " + df.format(valor) + " com sucesso.");
        } else if(saldo < valor) {
            System.out.println("\nSaldo insuficiente na conta.");
        }
    }

    public void exibirSaldo() {
        System.out.println("\nTitular: " + titular);
        System.out.println("Saldo: " + df.format(saldo));
    }

    public static void Executar() {
        ContaBancaria conta1 = new ContaBancaria("Alberto", 3500);

        conta1.depositar(500);
        conta1.sacar(100);
        conta1.exibirSaldo();
    }
}
