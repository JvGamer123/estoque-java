package model;

import java.util.Date;

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor() {

    }

    public Vendedor(String nome, String cargo, double salario, String cpf, Date dataDeNascimento, double comissao) {
        super(nome, cargo, salario, cpf, dataDeNascimento);
        this.comissao = comissao;
    }



    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void vender(double valorDoCarro) {
         this.comissao = valorDoCarro * 0.05;
    }

    @Override
    public void almocar() {
        System.out.println("O vendedor esta almocando...");
    }
}
