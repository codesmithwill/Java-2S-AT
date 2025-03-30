package utils;

import java.util.Scanner;

public class ValidarSaida {
    public static void Validar() {
        System.out.println("\nDigite 'sair' para encerrar o programa.");
        Scanner entrada = new Scanner(System.in);
        String escolha = entrada.nextLine().toLowerCase();

        while(!escolha.equals("sair")) {
            System.out.println("\nEntrada inválida.");
            System.out.print("Digite 'sair' para encerrar o programa:");
            escolha = entrada.nextLine().toLowerCase();
        }
    }
}
