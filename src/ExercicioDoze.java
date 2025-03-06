
import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.split("\\s+");

        int quantidadePalavras = palavras.length;

        System.out.println("A frase -> " + frase + " <- contém o total de" + quantidadePalavras + " palavras.");

        sc.close();
    }
}
