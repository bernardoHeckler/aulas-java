import java.util.Scanner;

public class TeoremaDePitagoras {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = lerTeclado.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = lerTeclado.nextDouble();
        double h = Math.sqrt(a*a + b*b);
        System.out.println("Você acabou de Calcular \n"+ " Cateto a: "+ a*a + " Cateto B: "+ b*b +" Total de H é: " + h);
    }    
}
