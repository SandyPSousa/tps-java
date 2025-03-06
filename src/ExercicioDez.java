import java.util.Scanner;
import java.util.Random;

public class ExercicioDez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        System.out.println(numeroAleatorio);
        int palpite;


        System.out.println("### Jogo de Adivinhação ###");
        System.out.println("Tente adivinhar o número entre 1 e 100:");

        do {
            palpite = sc.nextInt();

            if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Parabéns, você acertou! O número era: " + numeroAleatorio);
            }
        } while (palpite != numeroAleatorio);

        sc.close();
    }
}
