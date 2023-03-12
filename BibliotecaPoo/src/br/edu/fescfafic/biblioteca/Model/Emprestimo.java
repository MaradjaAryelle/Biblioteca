package br.edu.fescfafic.biblioteca.Model;

import java.util.ArrayList;
//Quando emprestar, acrescentar na lista historicoDeEmprestimo e obrasEmPosse
//Quando devolver, remover da lista obrasEmPosse
public class Emprestimo {

    public String dataSaida;
    public String dataEntrada;
    public Leitor nome;
    public Impressos codigoIdentificador;
    public Impressos nomeDaObra;
    public Impressos nomeDoAutor;

    public ArrayList<String> historicoDeEmprestimos = new ArrayList<>();
    public ArrayList<String> obrasEmPosse = new ArrayList<>();

    public Emprestimo(String dataSaida, String dataEntrada, Leitor nome, Impressos codigoIdentificador, Impressos nomeDaObra, Impressos nomeDoAutor){
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
        this.nome = nome;
        this.codigoIdentificador = codigoIdentificador;
        this.nomeDaObra = nomeDaObra;
        this.nomeDoAutor = nomeDoAutor;
            }

    public void adicionarEmprestimo(String obra){
        this.historicoDeEmprestimos.add(obra);
    }

    public void adicionarObra(String obra){
        this.obrasEmPosse.add(obra);
    }




}
