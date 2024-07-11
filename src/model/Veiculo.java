package model;

public class Veiculo {

    private String modelo;

    private String fabricante;

    private String cor;

    private double quilometragem;

    private String placa;

    private int numeroPassageiro;

    private double potencia;


    // construtor cheio
    public Veiculo(String modelo, String fabricante, String cor, double quilometragem, String placa, int numeroPassageiro, double potencia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.placa = placa;
        this.numeroPassageiro = numeroPassageiro;
        this.potencia = potencia;
    }

    // construtor vazio
    public Veiculo() {

    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPassageiro() {
        return numeroPassageiro;
    }

    public void setNumeroPassageiro(int numeroPassageiro) {
        this.numeroPassageiro = numeroPassageiro;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
