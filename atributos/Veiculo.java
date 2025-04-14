


class Veiculo {

    String marca;
    String modelo;
    int ano;
    String placa;

    int calcTempoUso( int anoBase ) {
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
