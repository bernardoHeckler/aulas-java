import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        char opcao;
        do {
            System.out.println("Digite S para continuar dentro do WHILE: ");

            // Otimizando esta linha:
            // String linha = lerTeclado.nextLine();
            // System.out.println(linha);
            // opcao = linha.charAt(0);
            opcao = lerTeclado.nextLine().charAt(0); // linha otimizada!
        } while (opcao == 'S');
    }
}