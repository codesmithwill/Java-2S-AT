package exercicios.exercicio12;

import utils.LimpaConsole;

import java.util.Scanner;

public class ChatUsuario {
    public static void Executar() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = entrada.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = entrada.nextLine();

        String[] historico = new String[10];
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print(usuario1 + ", digite sua mensagem: ");
            historico[contador] = usuario1 + ": " + entrada.nextLine();
            contador++;

            System.out.print(usuario2 + ", digite sua mensagem: ");
            historico[contador] = usuario2 + ": " + entrada.nextLine();
            contador++;
        }

        LimpaConsole.Limpar();
        System.out.println("===== Histórico de Mensagens =====");

        for (String mensagem : historico) {
            System.out.println(mensagem);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");

    }
}
