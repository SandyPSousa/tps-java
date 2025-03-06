import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário bruto anual: ");
        double salarioBruto = sc.nextDouble();

        double imposto = 0;

        // o cálculo foi feito com base nas informações desse site: https://www.creditas.com/exponencial/tabela-imposto-de-renda/
        if (salarioBruto <= 27870.40) {
            imposto = 0;
        } else if (salarioBruto <= 37751.55) {
            imposto = (salarioBruto * 0.075) - 2089.83;
        } else if (salarioBruto <= 50148.25) {
            imposto = (salarioBruto * 0.15) - 5268.16;
        } else if (salarioBruto <= 64259.59) {
            imposto = (salarioBruto * 0.225) - 9576.05;
        } else {
            imposto = (salarioBruto * 0.275) - 13932.41;
        }

        double salarioLiquido = salarioBruto - imposto;

        System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
        System.out.printf("\nImposto a pagar: R$ %.2f", imposto);
        System.out.printf("\nSalário Líquido: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}

