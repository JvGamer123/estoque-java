package model;

import java.util.Date;

public class ClienteFisico extends Cliente {


    private String cpf;

    public ClienteFisico(String nome, Date dataDeNascimento, char sexo, String telefone, String email, String cpf) {
        super(nome, dataDeNascimento, sexo, telefone, email);
        this.cpf = cpf;
    }

    public ClienteFisico() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
