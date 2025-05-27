import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        System.out.println("Número de animais: " + Animal.getContador());

        

        Animal cachorro = new Cachorro("Noah");
        Animal hamster = new Hamster("Maiquinho");
        Animal gato = new Gato("Jack");

        // AnimalUtils utils = new AnimalUtils();
        AnimalUtils.emitirSons(List.of(cachorro, hamster, gato));

        System.out.println("Número de animais: " + Animal.getContador());

    }


   

}
