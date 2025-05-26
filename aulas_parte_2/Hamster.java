public class Hamster extends Animal {
    
    public Hamster(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "sniff sniff";
    }
    
}
