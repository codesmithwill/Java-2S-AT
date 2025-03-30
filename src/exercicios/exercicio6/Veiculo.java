package exercicios.exercicio6;

import java.text.DecimalFormat;

public class Veiculo {
    DecimalFormat df = new DecimalFormat("#,###.# KM");
    public String placa;
    public String modelo;
    public int anoFabricacao;
    public double quilometragem;

    public void registrarViagem(double km) {
        quilometragem = km;
    }

    public void exibirDetalhes()
    {
        System.out.println("\n--------- Detalhes de Veiculo --------");
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Modelo do Veículo: " + modelo);
        System.out.println("Ano de Fabricação do Veículo: " + anoFabricacao);
        System.out.println("Quilometragem total: " + df.format(quilometragem));
        System.out.println("---------------------------------------\n");
    }

    public static void Executar() {
        Veiculo v1 = new Veiculo();
        v1.placa = "HOK4G77";
        v1.modelo = "Honda Civic";
        v1.anoFabricacao = 2025;
        v1.registrarViagem(3500);
        v1.exibirDetalhes();

        Veiculo v2 = new Veiculo();
        v2.placa = "ABC1D23";
        v2.modelo = "Volskwagen Fox";
        v2.anoFabricacao = 2016;
        v2.registrarViagem(56325);
        v2.exibirDetalhes();
    }
}
