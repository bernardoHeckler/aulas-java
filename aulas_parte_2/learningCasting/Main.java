import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Mamifero mimosa = new Mamifero("Mimosa", 4);
        Animal animal1 = mimosa;

        animal1 = new Ave("Kita", "Bico de papagaio");

        if (animal1 instanceof Mamifero) {
            Mamifero mamifero1 = (Mamifero) animal1;
            System.out.println(mamifero1.getNumeroTetas());
        }
        System.out.println(animal1.getNome());
        System.out.println(mimosa.getNome());
        System.out.println(mimosa.getNumeroTetas());
        // System.out.println(animal1.getNumeroTetas());
    }

    public static void imprimirAnimais(List<Animal> animais) {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}
