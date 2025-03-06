import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        int valorInicial = sc.nextInt();

        System.out.println("Digite o valor do incremento: ");
        int incremento = sc.nextInt();

        System.out.println("Sequência numérica:");

        for (int i = valorInicial; i <= 101; i += incremento) {
            if (i != valorInicial) {
                System.out.print(", ");
            }
            System.out.print(i);
        }

        System.out.println(); //
        sc.close();
    }
}
