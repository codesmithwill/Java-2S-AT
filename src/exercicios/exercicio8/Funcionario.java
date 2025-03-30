package exercicios.exercicio8;

import java.text.DecimalFormat;

public class Funcionario {
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    public String nome;
    public double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Salário Base: " + df.format(salarioBase));
        System.out.println("Salário Final: " + df.format(calcularSalario()) + "\n");
    }

    public static void Executar() {
        Funcionario funcionario = new Funcionario("Willian", 3500);
        Funcionario gerente = new Gerente("Carlos", 2300);
        Funcionario estagiario = new Estagiario("Lucas", 1200);

        System.out.println("Informações do Funcionário:");
        funcionario.exibirInformacoes();

        System.out.println("Informações do Gerente:");
        gerente.exibirInformacoes();

        System.out.println("Informações do Estagiário:");
        estagiario.exibirInformacoes();
    }
}
