package model;

import java.util.Date;

public class ClienteJuridico extends Cliente{

    private String cnpj;

    public ClienteJuridico() {

    }

    public ClienteJuridico(String nome, Date dataDeNascimento, char sexo, String telefone, String email, String cnpj) {
        super(nome, dataDeNascimento, sexo, telefone, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
