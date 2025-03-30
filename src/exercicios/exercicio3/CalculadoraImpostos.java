package exercicios.exercicio3;

import org.w3c.dom.ls.LSOutput;
import utils.LimpaConsole;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraImpostos {
    public static void CalcularImpostos() {
        Scanner entrada = new Scanner(System.in);
        double imposto;

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        double salario = 0;

        boolean entradaValida = false;

        while(!entradaValida) {
            try {
                System.out.println("Digite seu salário anual: ");
                salario = entrada.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("\nERRO: Entrada inválida.\nDigite novamente utilizando , como separador.\n");
                entrada.nextLine();
            }

        }

        if (salario <= 22847.76) {
            imposto = 0;
            MensagemImpostos(salario, imposto, nome);
        } else if (salario >= 22847.77 && salario <= 33919.80) {
            imposto = 0.075;
            MensagemImpostos(salario, imposto, nome);
        } else if (salario >= 33919.81 && salario <= 45012.60) {
            imposto = 0.15;
            MensagemImpostos(salario, imposto, nome);
        } else if (salario >= 45012.61) {
            imposto = 0.275;
            MensagemImpostos(salario, imposto, nome);
            }
    }

    public static void MensagemImpostos(double valor, double imposto, String nome) {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        DecimalFormat df2 = new DecimalFormat("#.##");
        double valorImposto = valor * imposto;
        double calcLiquido = valor - valorImposto;

        LimpaConsole.Limpar();
        System.out.println("------------ CALCULADORA DE IMPOSTOS ------------");
        System.out.println("Nome: " + nome);
        System.out.println("Seu salário anual: " + df.format(valor));

        if (imposto == 0) {
            System.out.println("Seu imposto de renda: Isento");
        } else {
            System.out.println("Seu imposto de renda: " + df2.format((imposto * 100)) + "%");
            System.out.println("Valor do imposto: " + df.format(valorImposto));
        }

        System.out.println("Salário liquido: " + df.format(calcLiquido));
        System.out.println("----------------------------------------------");


    }
}
