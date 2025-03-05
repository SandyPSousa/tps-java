import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do dia em que você nasceu: ");
        int diaNascimento = sc.nextInt();

        System.out.println("Digite o número do mês em que você nasceu: ");
        int mesNascimento = sc.nextInt();

        System.out.println("Digite o número do ano em que você nasceu: ");
        int anoNascimento = sc.nextInt();

        java.time.LocalDate dataAtual = java.time.LocalDate.now();

        java.time.LocalDate dataNascimento = java.time.LocalDate.of(anoNascimento, mesNascimento, diaNascimento);

        java.time.Period periodo = java.time.Period.between(dataNascimento, dataAtual);

        long dias = java.time.temporal.ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.printf("Você tem %d anos, %d meses e %d dias.\n", periodo.getYears(), periodo.getMonths(), periodo.getDays());
        System.out.printf("Isso dá um total de: %d dias.\n", dias);

        sc.close();
    }
}
