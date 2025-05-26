import java.util.Scanner;

public class ExemploMenus {
    public static void main(String[] args) {
        String menu = """
                \n
                        Escolha uma das opções abaixo:
                \n
                        1 - Cadastrar
                        2 - Listar
                        3 - Apagar
                        0 - Sair
                        """;
        System.out.println(menu);
        Scanner lerTeclado = new Scanner(System.in);
        int opcao = lerTeclado.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Cadastrando...");
                break;
            case 2:
                System.out.println("Listando...");
                ;
                break;
            case 3:
                System.out.println("Apagando...");
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
