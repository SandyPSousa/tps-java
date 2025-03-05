import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("\nA sua Média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Parabéns! Você está Aprovado!");
        } else if (media >= 5) {
            System.out.println("Você está de Recuperação!");
        } else {
            System.out.println("Infelizmente você foi Reprovado! :( ");
        }

        sc.close();
    }
}
