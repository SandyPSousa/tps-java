
    import java.util.Scanner;


 public class ExercicioCinco {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nDesconto disponível para compras acima de R$500,00\nDigite o valor da compra: ");
            double valorCompra = sc.nextDouble();

            double desconto = 0;

            if (valorCompra > 1000) {
                desconto = 0.10;
            } else if (valorCompra >= 500) {
                desconto = 0.05;
            }

            double valorDesconto = valorCompra * desconto;
            double valorFinal = valorCompra - valorDesconto;

            System.out.printf("\nValor original: R$ %.2f", valorCompra);
            System.out.printf("\nValor do desconto: R$ %.2f", valorDesconto);
            System.out.printf("\nValor final: R$ %.2f\n", valorFinal);

            sc.close();
        }
    }


