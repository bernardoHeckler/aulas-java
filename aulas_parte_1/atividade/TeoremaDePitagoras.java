// RA: 1137118
// Nome: Bernardo Antunes Heckler
// Atividade: Cálculo da Hipotenusa com o Teorema de Pitágoras

import java.util.Scanner;

public class TeoremaDePitagoras {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("\nDigite o valor de A: ");
        double a = lerTeclado.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = lerTeclado.nextDouble();
        double h = Math.sqrt(a*a + b*b);
        System.out.println("Você acabou de Calcular a Hipotenusa de um Triângulo Retângulo usando o Teorema de Pitágoras.\n"+ "Cateto A: "+ a +"²" + "\nCateto B: "+ b +"²");
        System.out.printf("\nTotal de H é: %.2f", h);
    }    
}
