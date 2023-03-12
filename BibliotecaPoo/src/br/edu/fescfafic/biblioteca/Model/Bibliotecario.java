package br.edu.fescfafic.biblioteca.Model;

public class Bibliotecario extends Pessoa {
    public String CRB;

    public Bibliotecario(String cpf, String rg, String nome, String CRB){
        super(cpf, rg, nome);
        this.CRB = CRB;
    }

    public String getCoren() {
        return CRB;
    }

    public void setCoren(String coren) {
        this.CRB = coren;
    }

    @Override
    public String toString() {
        return "Bibliotecário{" +
                "coren='" + CRB + '\'' +
                ", _cpf='" + _cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
