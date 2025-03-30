package exercicios.exercicio4;

import utils.LimpaConsole;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimuladorEmprestimo {
    public static void Simulador() {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();


        double valorEmprestimo = 0;
        boolean valorValido = false;

        while(!valorValido) {
            try {
                System.out.print("Digite o valor do empréstimo (em R$): ");
                valorEmprestimo = entrada.nextDouble();
                if (valorEmprestimo <= 0) {
                    System.out.println("\nO valor do empréstimo deve ser maior que 0.\n");
                } else {
                    valorValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, insira um número válido.\n");
                entrada.next();
            }
        }

        int parcelas = 0;
        boolean parcelasValidas = false;

        while(!parcelasValidas) {
            try {
                System.out.print("Digite a quantidade de parcelas.\n" +
                        "Atenção! Mínimo de 06 parcelas e Máximo de 48 parcelas.\n" +
                        "Insira: ");
                parcelas = entrada.nextInt();

                if (parcelas < 6 || parcelas > 48) {
                    System.out.println("\nQuantidade de parcelas inválida!\n" +
                            "Deve ser entre: 06 e 48.\n");
                } else {
                    parcelasValidas = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, insira um número válido.\n");
                entrada.next();
            }
        }

        double taxaJuros = 0.03;
        double valorTotalPago = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
        double valorParcelaMensal = valorTotalPago / parcelas;

        LimpaConsole.Limpar();
        System.out.println("----- Simulação de Empréstimo -----");
        System.out.println("Cliente: " + nome);
        System.out.println("Valor do Empréstimo: " + valorEmprestimo);
        System.out.println("Quantidade parcelas: " + parcelas);
        System.out.println("Porcentagem dos Juros: " + (taxaJuros * 100) + "%");
        System.out.println("\nValor total Pago (com juros): " + df.format(valorTotalPago));
        System.out.println("Valor da Parcela Mensal: " + df.format(valorParcelaMensal));
    }
}
