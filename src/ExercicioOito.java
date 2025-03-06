import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado 1: ");
        double lado1 = sc.nextDouble();

        System.out.println("Digite o comprimento do lado 2: ");
        double lado2 = sc.nextDouble();

        System.out.println("Digite o comprimento do lado 3: ");
        double lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
        {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é Equilátero.");

            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é Isósceles.");

            } else {
                System.out.println("O triângulo é Escaleno.");
            }

        } else {
            System.out.println("As medidas não formam um triângulo válido.");
        }

        sc.close();
    }
}
