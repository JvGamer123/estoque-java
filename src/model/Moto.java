package model;

public class Moto extends Veiculo {

    private boolean bau;

    public Moto(String modelo, String fabricante, String cor, double quilometragem, String placa, int numeroPassageiro, double potencia, boolean bau) {
        super(modelo, fabricante, cor, quilometragem, placa, numeroPassageiro, potencia);
        this.bau = bau;
    }

    public Moto() {
    }

    public boolean isBau() {
        return bau;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }
}
