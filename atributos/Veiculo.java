
import java.time.LocalDate;

class Veiculo {

    String marca;
    String modelo;
    int ano;
    String placa;

    Veiculo() {
        this.marca = "Marca-não-registrada";
        this.modelo = "Modelo-não-nomeado";
        this.placa = "Placa-não-registrada";
    }

    Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;

    }

    int calcTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        return this.calcTempoUso(anoAtual);
    }

    int calcTempoUso(int anoBase) {
        int tempoUso = anoBase - this.ano;
        return tempoUso;
    }

    Veiculo cloneMe() {
        Veiculo novo = new Veiculo();
        novo.marca = this.marca;
        novo.modelo = this.modelo;
        novo.ano = this.ano;
        novo.placa = this.placa;
        return novo;
    }
}
