package br.edu.fescfafic.biblioteca.Model;

import java.util.ArrayList;

public class Leitor {
    public String nome;
    public int idade;
    public ArrayList<Emprestimo> historicoDeEmprestimos = new ArrayList<>();
    public ArrayList<Emprestimo> obrasEmPosse = new ArrayList<>();
    protected String _cpf;
    private String _rg;
    public int debito;
//Se tiver debito o cadastro não será liberado, false
    public boolean cadastroLiberado;

    public Leitor(String nome, int idade, String cpf, String rg, boolean cadastroLiberado, int debito){
        this._cpf = cpf;
        this._rg = rg;
        this.idade = idade;
        this.nome = nome;
        this.cadastroLiberado = cadastroLiberado;
        this.debito = debito;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo){
        this.historicoDeEmprestimos.add(emprestimo);
    }

    public void adicionarObra(Emprestimo emprestimo){
        this.obrasEmPosse.add(emprestimo);
    }

    public void setCadastroLiberado(boolean status){
        this.cadastroLiberado = status;
    }

}
