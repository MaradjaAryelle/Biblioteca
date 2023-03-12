package br.edu.fescfafic.biblioteca.Model;

public class Bibliotecario extends Pessoa {
    public String CRB;

    public Bibliotecario(String cpf, String rg, String nome, String CRB){
        super(cpf, rg, nome);
        this.CRB = CRB;
    }

    public String getCRB() {
        return CRB;
    }

    public void setCRB(String CRB) {
        this.CRB = CRB;
    }

    @Override
    public String toString() {
        return "Bibliotecário{" +
                "CRB='" + CRB + '\'' +
                ", _cpf='" + _cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
