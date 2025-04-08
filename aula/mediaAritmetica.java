import java.util.Scanner;

public class mediaAritmetica {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Digite sua nota da G1: ");
        double notaG1 = lerTeclado.nextDouble();
        System.out.print("Digite sua nota da G2: ");
        double notaG2 = lerTeclado.nextDouble();

        String mensagem = (notaG1 > notaG2)
                ? "A nota G1 é maior que G2"
                : "A nota G2 é maior ou igual a G1";
        System.out.println(mensagem);

        double media = (notaG1 + notaG2) / 2;
        System.out.printf("Sua média é: %.2f \n", media);

        // Exemplo com Switch
        String msg = switch((int) media) {
            case 7, 8, 9, 10 -> "Parabéns! você foi Aprovado.";
            case 3, 4, 5, 6 -> "Você está em Exame!";
            default -> "Bah, você foi Reprovado!";
        };
        System.out.println(msg);

        // Exemplo com IFs
        if (media >= 7)
            System.out.println("Parabéns! você foi Aprovado.");
        else if (media >= 3)
            System.out.println("Você está em Exame!");
        else
            System.out.println("Bah, você foi Reprovado!");

    }
}