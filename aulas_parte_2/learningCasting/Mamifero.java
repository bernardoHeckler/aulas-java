public class Mamifero extends Animal{
    private int numeroTetas;

    public Mamifero(String nome, int numeroTetas) {
        super(nome);
        this.numeroTetas = numeroTetas;
    }

    public int getNumeroTetas() {
        return numeroTetas;
    }

}
