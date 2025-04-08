import java.util.Scanner;

public class curaDoCancer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do paciente:");
        String nome = scanner.nextLine();
        System.out.println("Ele tem Cancer?");
        String resposta = scanner.nextLine();
        System.out.println("Eu tenho a cura do cancer? (Y/N)");
        String resposta2 = scanner.nextLine();
        if (resposta.equals("Sim") && resposta2.equals("Y")) {
            System.out.println("Parabéns, " + nome + "! Você foi curado do câncer!");
        } else {
            System.out.println("Desculpe, " + nome + ". Não tenho a cura do câncer.");
        }
    }
}
