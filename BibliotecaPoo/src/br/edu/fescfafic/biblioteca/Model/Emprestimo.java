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


    public Emprestimo(String dataSaida, String dataEntrada, Leitor nome, Impressos codigoIdentificador, Impressos nomeDaObra, Impressos nomeDoAutor){
        this.dataSaida = dataSaida;
        this.dataEntrada = dataEntrada;
        this.nome = nome;
        this.codigoIdentificador = codigoIdentificador;
        this.nomeDaObra = nomeDaObra;
        this.nomeDoAutor = nomeDoAutor;
            }




}
