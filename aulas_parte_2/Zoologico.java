import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Noah");
        Animal gato = new Gato("Jack");
        Animal hamster = new Hamster("Maiquinho");

        emetirSons(List.of(cachorro, gato, hamster));
    }

    public static void emetirSons(List<Animal> animais){
        for (Animal animal : animais) {
            System.out.println("O animal de nome " + animal.getNome() + " faz som de " + animal.emitirSom()) ;
        }        
    }
    
}
