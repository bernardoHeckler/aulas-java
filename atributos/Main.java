
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        Veiculo corolla = new Veiculo();
        corolla.marca = "Toyota";
        corolla.modelo = "4.0";
        corolla.ano = 2009;
        corolla.placa = "JBK-2190";

        Veiculo novoCorolla1 = corolla.cloneMe();
        Veiculo novoCorolla2 = corolla.cloneMe();
        
        Veiculo carroCliente = new Veiculo();
        carroCliente.marca = "BMW";
        carroCliente.modelo = "Turbo";
        carroCliente.ano = 2005;
        carroCliente.placa = "IUJ-3980";

        Veiculo novoCorolla = corolla.cloneMe();
        novoCorolla.ano = 2020;

        System.out.println(corolla.ano);
        System.out.println(novoCorolla.ano);
        
        corolla.ano = 2011;

        int anoAtual = LocalDate.now().getYear();

        int tempoUsoCorolla = corolla.calcTempoUso(anoAtual);
        System.out.println("\nTempo de uso: " + tempoUsoCorolla + " anos");

        System.out.println("\nO meu carro é " + corolla.marca + " - " + corolla.modelo + " - ");

    }
}

