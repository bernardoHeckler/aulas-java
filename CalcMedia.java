// ele vai puxar o import de uma bibilioteca do Scanner no Java
import java.util.Scanner;

public class CalcMedia {
    public static void main(String[] args) {
        // char exemploChar = 'd';

        // Declaração de uma variavel do tipo int 
        // e atribuição de valor
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu RA: ");
        int ra = lerTeclado.nextInt();
        lerTeclado.nextLine(); // para limpar buffer teclado
        
        System.out.println("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite a nota G1: ");
        double g1 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); // para limpar buffer teclado
        
        System.out.println("Digite a nota G2: ");
        double g2 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); // para limpar buffer teclado
        
        System.out.println("Existe ponto extra: (true/false)");
        boolean pontoExtra = lerTeclado.nextBoolean();

        double media = calcMediaAritmetica(g1, g2);
        // Se o pontoEstra for True -> somar 1
        //if (pontoExtra == true) {
        if (pontoExtra) {
            media++;
        }
        if (ra % 2 == 0){
            System.out.println("RA é um número PAR, e pelo o que apareçe no meu sistema, você é o aluno: " + nome);
        }
        else{
            System.out.println("RA é um número IMPAR, e pelo o que apareçe no meu sistema, você é o aluno: " + nome);
        }
//        media++; // media += 1; (python)
        System.out.println("Sua média é: " + media);
    }

    static double calcMediaAritmetica(double nota1, double nota2){
        double retorno = (nota1 + nota2) / 2;
        return retorno;
    }
    static void imprimirMedia(double media){
        System.out.println("A média é: " + media);
    }
}