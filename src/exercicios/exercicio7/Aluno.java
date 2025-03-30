package exercicios.exercicio7;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aluno {
    DecimalFormat df = new DecimalFormat("#.##");
    public String nome;
    public String matricula;
    public double nota1, nota2, nota3;
    public double media;

    public double calcularMedia() {
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média das Notas: " + df.format(media));
        return media;
    }

    public void verificarAprovacao() {
        System.out.println("\nAluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        media = calcularMedia();
        if (media >= 7) {
            System.out.println("Status do Aluno: Aprovado");
        } else {
            System.out.println("Status do Aluno: Reprovado");;
        }
    }

    public static void Executar() {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = entrada.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        aluno.matricula = entrada.nextLine();

        boolean notaValida = false;

        while (!notaValida) {
            try {
                System.out.print("Digite a primeira nota do aluno: ");
                aluno.nota1 = entrada.nextDouble();

                System.out.print("Digite a segunda nota do aluno: ");
                aluno.nota2 = entrada.nextDouble();

                System.out.print("Digite a terceira nota do aluno: ");
                aluno.nota3 = entrada.nextDouble();

                notaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("\nERRO: Para a nota: \n" +
                        "1. Utilize a vírgula para separar a casa decimal\n" +
                        "2. Utilize apenas números.\n");

                entrada.nextLine();
            }
        }
        aluno.verificarAprovacao();
    }
}
