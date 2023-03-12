package br.edu.fescfafic.biblioteca.Model;

import java.util.ArrayList;
//Quando emprestar, acrescentar na lista historicoDeEmprestimo e obrasEmPosse
//Quando devolver, remover da lista obrasEmPosse
public class Emprestimo {

    public String data;
    public Medica medica;
    public Bibliotecario bibliotecario;
    Triagem triagem;

    public ArrayList<String> listaDeRemedios = new ArrayList<>();

    public String observacaoDoMedico;

    public Emprestimo(String data, Triagem triagem, Medica medica, Bibliotecario bibliotecario){
        this.data = data;
        this.medica = medica;
        this.bibliotecario = bibliotecario;
        this.triagem = triagem;
    }

    public void adicionarObservacao(String texto){
        this.observacaoDoMedico = texto;
    }

    public void receitarMedicacao(String medicacao){
        this.listaDeRemedios.add(medicacao);
    }


}
