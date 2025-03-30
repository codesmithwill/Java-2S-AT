package exercicios.exercicio2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SenhaSegura {
    public static void Executar() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        String senha;
        boolean senhaValida;

        do {
            System.out.print("Digite uma senha: ");
            senha = entrada.nextLine();
            String msgValidacao = validarSenha(senha);
            senhaValida = msgValidacao == null;

            if (senhaValida) {
                System.out.println("Senha cadastrada.");
            } else {
                System.out.println("Erro: " + msgValidacao);
            }
        } while (!senhaValida);
    }

    public static String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter no mínimo 8 caracteres.";
        }
        if (!Pattern.compile(".*[A-Z].*").matcher(senha).matches()) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!Pattern.compile(".*\\d.*").matcher(senha).matches()) {
            return "A senha deve conter pelo menos um número.";
        }
        if (!Pattern.compile(".*[!@#$%^&*()_+\\-={};':\"\\\\|,.<>?/`~].*").matcher(senha).matches()) {
            return "A senha deve conter pelo menos um caractere especial.";
        }
        return null;
    }
}
