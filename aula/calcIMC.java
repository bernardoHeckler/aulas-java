import java.util.Scanner;
// Calcular IMC:
// TELAS DE INSERIR TEXTO USANDO SCANNER + SYSTEM.IN
// CLASSIFICAÇÕES DE GENEROS: M, F, N
// CALCULO DE IMC = PESO / (ALTURA * ALTURA)
// PARA PEGAR NOME USANDO MÉTODO CHAR 
// GENERO = LERTECLADO.NEXT().CHARTAT(0)
// PARA PEGAR PESO E ALTURA USANDO MÉTODO NEXTFLOAT()
// LISTA DE IMC:
// CLASSIFICAÇÃO        |    Masculino      |     Feminino
// Obesidade Mórbida    | Maior ou igual 40 | Maior ou igual 39
// Obesidade Moderada   | 30 a 39,9         | 29 a 38,9
// Obesidade Leve       | 25 a 29,9         | 24 a 28,9
// Normal               | 20 a 24,9         | 19 a 23,9
// Abaixo do Normal     | Menos de 20       | Menos de 19
//
// STRING TEXTBLOCK = """;
// System.out.print("\033[H\033[2J");   PARA LIMPAR A TELA              done
// UTILIZAR \N PARA QUEBRAR LINHA

public class calcIMC {

    public static final String CLEAR_CONSOLE = "\033[H\033[2J";

    // Método para limpar o console
    public static void clearScreen() {
        System.out.print(CLEAR_CONSOLE);
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        clearScreen(); // limpa a tela
        String textoBlock = """
                --Calculadora de IMC--
                """;
        System.out.print(textoBlock);
        System.out.print("Digite o Nome do paciente:");
        String nome = lerTeclado.nextLine();
        System.out.print("Digite o Gênero: (M)asculino, (F)eminino ou (N)ão informar:");
        char genero = lerTeclado.next().charAt(0);
        System.out.print("Digite a Altura:");
        double altura = lerTeclado.nextDouble();
        System.out.print("Digite o Peso:");
        double peso = lerTeclado.nextDouble();
        double IMC = peso / (altura * altura);
        String tipoGenero = switch (genero) {
            case 'm','M' -> "Masculino";
            case 'f','F' -> "Feminino";
            case 'n','N' -> "Preferiu não informar";
            default -> "Gênero não reconhecido";
        };
        clearScreen();
        System.out.printf("Nome: " + nome + " \n Gênero: " + tipoGenero + " \n Altura: " + altura + " \nPeso: " + peso
                + " \n Resultado do IMC: %.2f", IMC);
        System.out.println("\n Ver a classificação? Digite (S)");
        String opcao = lerTeclado.next();
        if (opcao.equals("S")) {
            clearScreen();
        }
        switch (tipoGenero) {
            case "Masculino":
                if (IMC >= 40) {
                    System.out.println("Obesidade Mórbida");
                } else if (IMC >= 30) {
                    System.out.println("Obesidade Moderada");
                } else if (IMC >= 25) {
                    System.out.println("Obesidade Leve");
                } else if (IMC >= 20) {
                    System.out.println("Normal");
                } else {
                    System.out.println("Abaixo do Normal");
                }
                break;

            case "Feminino", "Preferiu não informar":
                if (IMC >= 39) {
                    System.out.println("Obesidade Mórbida");
                } else if (IMC >= 29) {
                    System.out.println("Obesidade Moderada");
                } else if (IMC >= 24) {
                    System.out.println("Obesidade Leve");
                } else if (IMC >= 19) {
                    System.out.println("Normal");
                } else {
                    System.out.println("Abaixo do Normal");
                }
                break;

            default:
                System.out.println("Gênero não reconhecido");
                break;
        }
    }
}