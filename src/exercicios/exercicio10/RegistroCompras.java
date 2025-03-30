package exercicios.exercicio10;

import javax.xml.stream.util.StreamReaderDelegate;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class RegistroCompras {
    public void Registrar() {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        Scanner entrada = new Scanner(System.in);
        FileWriter escrita = null;

        System.out.println("------------ REGISTRO DE COMPRAS -------------");
        System.out.print("Digite o produto que deseja registrar: ");
        String produto = entrada.nextLine();

        System.out.print("Digite a quantidade disponível: ");
        int quantidade = entrada.nextInt();

        System.out.print("Digite o preço unitário do produto: ");
        double preco = entrada.nextDouble();

        try {
            File arquivo = new File("produtos.txt");

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            boolean arqVazio = (arquivo.length() == 0);

            escrita = new FileWriter(arquivo, true);

            if (!arqVazio) {
                escrita.write("\n\n");
            }

            escrita.write( "Produto: " + produto +
                    "\nQuantidade: " + quantidade +
                    "\nValor unitário: " + df.format(preco));
            System.out.println("Registro de compra realizado.");
        } catch (IOException e) {
            System.out.println("Não foi possível gravar.");
        } catch (Exception e) {
            System.out.println("Erro ao gravar registro.");
        } finally {
            try {
                if (escrita != null) {
                    escrita.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao gravar registro.");
            }
        }

    }
    public void ExibirCompras() {
        try (FileReader leitor = new FileReader("produtos.txt")) {
            System.out.println("------------ LISTA DE COMPRAS REGISTRADAS -------------");
            int caractere;
            while ((caractere = leitor.read()) != -1) {
                System.out.print((char) caractere);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void Executar() {
        RegistroCompras registro = new RegistroCompras();
        registro.Registrar();
        registro.ExibirCompras();
    }
}
