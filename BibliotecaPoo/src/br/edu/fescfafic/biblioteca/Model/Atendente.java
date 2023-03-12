package br.edu.fescfafic.biblioteca.Model;

public class Atendente extends Pessoa {

    public Atendente(String cpf, String rg, String nome){
        super(cpf, rg, nome);
    }

    @Override
    public String toString() {
        return "Atendente{" +
                "_cpf='" + _cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
