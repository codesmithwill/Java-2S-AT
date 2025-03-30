import exercicios.exercicio1.OlaMundo;
import exercicios.exercicio10.RegistroCompras;
import exercicios.exercicio11.SimulacaoLoterica;
import exercicios.exercicio12.ChatUsuario;
import exercicios.exercicio2.SenhaSegura;
import exercicios.exercicio3.CalculadoraImpostos;
import exercicios.exercicio4.SimuladorEmprestimo;
import exercicios.exercicio5.SimularCGI;
import exercicios.exercicio6.Veiculo;
import exercicios.exercicio7.Aluno;
import exercicios.exercicio8.Estagiario;
import exercicios.exercicio8.Funcionario;
import exercicios.exercicio8.Gerente;
import exercicios.exercicio9.ContaBancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import static utils.LimpaConsole.Limpar;
import static utils.ValidarSaida.Validar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Limpar();
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        while (opcao != -1) {
            System.out.println("------------------ AT - Java -----------------\n");
            for (int i = 0; i < 12; i++) {
                System.out.println((i + 1) + " - Exercício " + (i + 1));
            }

            System.out.println("\n-1 - Para encerrar a aplicação.");
            System.out.println("-----------------------------------------------\n");
            System.out.print("Digite a opção desejada: ");

            if (input.hasNextInt()) {
                opcao = input.nextInt();
            } else {
                System.out.println("Insira um número válido.");
                input.next();
                continue;
            }

            switch(opcao) {
                case 1:
                    Limpar();
                    OlaMundo.Executar();
                    Validar();
                    break;
                case 2:
                    Limpar();
                    SenhaSegura.Executar();
                    Validar();
                    break;
                case 3:
                    Limpar();
                    CalculadoraImpostos.CalcularImpostos();
                    Validar();
                    break;
                case 4:
                    Limpar();
                    SimuladorEmprestimo.Simulador();
                    Validar();
                    break;
                case 5:
                    Limpar();
                    SimularCGI.Executar();
                    Validar();
                    break;
                case 6:
                    Limpar();
                    Veiculo.Executar();
                    Validar();
                    break;
                case 7:
                    Limpar();
                    Aluno.Executar();
                    Validar();
                    break;
                case 8:
                    Limpar();
                    Funcionario.Executar();
                    Validar();
                    break;
                case 9:
                    Limpar();
                    ContaBancaria.Executar();
                    Validar();
                    break;
                case 10:
                    Limpar();
                    RegistroCompras.Executar();
                    Validar();
                    break;
                case 11:
                    Limpar();
                    SimulacaoLoterica.Executar();
                    Validar();
                    break;
                case 12:
                    Limpar();
                    ChatUsuario.Executar();
                    Validar();
                    break;
                case -1:
                    break;
            }
        }
        input.close();
    }
}