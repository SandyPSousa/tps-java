import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o nome da sua mãe: ");
        String mae = sc.nextLine();

        System.out.println("Digite o nome do seu pai: ");
        String pai = sc.nextLine();

        String maiorNome = nome;
        if (mae.length() > maiorNome.length()) {
            maiorNome = mae;
        }
        if (pai.length() > maiorNome.length()) {
            maiorNome = pai;
        }

        System.out.println("\n### Informações: ###\nNome: " + nome + "\nIdade: " + idade + "\nNome da Mãe: " + mae +"\nNome do Pai: " + pai );
        System.out.println("\nO maior nome é: " + maiorNome +", com " + maiorNome.length() + " letras!");

        sc.close();

    }
}
