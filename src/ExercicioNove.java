import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastre uma senha: ");
        String senha = sc.nextLine();

        String senhaConfirmacao;
        do {
            System.out.println("Digite a senha novamente: ");
            senhaConfirmacao = sc.nextLine();

            if (!senhaConfirmacao.equals(senha)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (!senhaConfirmacao.equals(senha));

        System.out.println("Sua senha foi cadastrada com sucesso!");

        sc.close();
    }
}
