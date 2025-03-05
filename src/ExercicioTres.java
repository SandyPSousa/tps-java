import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double taxaDolar = 5.8;
        double taxaEuro = 6.0;
        double taxaLibra = 7.56;

        System.out.println("Digite o valor em reais: ");
        double valorReais = sc.nextDouble();

        System.out.println("\nEscolha a moeda de destino: \nDigite:\n 1 para DÓLAR\n 2 para EURO\n 3 para LIBRA: ");
        int opcao = sc.nextInt();

        double valorConvertido = 0;
        String moeda = "";

        switch (opcao) {
            case 1:
                valorConvertido = valorReais / taxaDolar;
                moeda = "dólares";
                break;
            case 2:
                valorConvertido = valorReais / taxaEuro;
                moeda = "euros";
                break;
            case 3:
                valorConvertido = valorReais / taxaLibra;
                moeda = "libras";
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        System.out.printf("O valor convertido de R$ %.2f é %.2f %s\n", valorReais, valorConvertido, moeda);


        sc.close();
    }
}



