public class CastingPrimitivos {

    public static void main(String[] args) {

        // Forma primitiva implícita
        int numeroInt = 100;
        float numeroFloat = numeroInt;
        double numeroDouble = numeroFloat;
        System.out.println("N° Inteiro: " + numeroInt);
        System.out.println("N° Float: " + numeroFloat);
        System.out.println("N° Double: " + numeroDouble);

        // Forma casting explícido
        double piDouble = 3.14159265359;
        float piFloat = (float) piDouble;
        int piInt = (int) piFloat;
        System.out.println("N° Inteiro: " + piDouble);
        System.out.println("N° Float: " + piFloat);
        System.out.println("N° Double: " + piInt);

        

    }
}