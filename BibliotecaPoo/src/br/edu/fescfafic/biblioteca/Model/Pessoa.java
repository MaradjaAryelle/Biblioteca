package br.edu.fescfafic.biblioteca.Model;

abstract class Pessoa {

    protected String _cpf;
    private String _rg;
    public String nome;

    Pessoa(String cpf, String rg, String nome){
        this._cpf = cpf;
        this._rg = rg;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "_cpf='" + _cpf + '\'' +
                ", _rg='" + _rg + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
