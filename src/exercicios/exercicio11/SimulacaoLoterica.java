package exercicios.exercicio11;

import java.io.Console;
import java.util.*;

public class SimulacaoLoterica {
    public void Loteria() {
        Random random = new Random();
        List<Integer> numeros = new ArrayList<Integer>();

        while (numeros.size() < 6) {
            int numero = random.nextInt(60) + 1;
            if (!numeros.contains(numero)) {
                numeros.add(numero);
            }
        }

        Scanner entrada = new Scanner(System.in);
        List<Integer> numerosUsuario = new ArrayList<>();

        System.out.println("Digite 6 números entre 1 e 60.");
        while (numerosUsuario.size() < 6) {
            try {
                System.out.print("Número [" + (numerosUsuario.size() + 1) + "]: ");
                int numero = entrada.nextInt();

                if (numero < 1 || numero > 60) {
                    System.out.println("\nApenas números inteiros entre 1 e 60.\n");
                } else if (numerosUsuario.contains(numero)) {
                    System.out.println("\nVocê já inseriu esse número, insira outro!");
                } else {
                    numerosUsuario.add(numero);
                }
            } catch (InputMismatchException e) {
                System.out.println("\nApenas números inteiros entre 1 e 60!");
                entrada.nextLine();
            }
        }

        int acertos = 0;
        for (int numero : numerosUsuario) {
            if (numeros.contains(numero)) {
                acertos++;
            }
        }

        System.out.println("Números sorteados: " + numeros);
        System.out.println("Números inseridos: " + numerosUsuario);
        System.out.println("Você acertou: " + acertos + " número(s).");
    }

    public static void Executar() {
        SimulacaoLoterica loterica = new SimulacaoLoterica();
        loterica.Loteria();
    }
}
