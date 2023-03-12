package br.edu.fescfafic.biblioteca.Main;

import br.edu.fescfafic.biblioteca.Model.*;

public class Main {
    public static void main(String[] args) {

        Leitor leitor = new Leitor(
                "Jorge",
                23,
                "0000000",
                "00000000",
                false,
                false
        );

        leitor.adicionarAlergias("Chocolate");
        leitor.adicionarAlergias("Proteina XYZ do leite");
        leitor.adicionarAlergias("Bezetacil");
        leitor.adicionarAlergias("Agua");

        leitor.adicionarDoenca("Diabete");
        leitor.adicionarDoenca("Hipertenso");
        leitor.adicionarDoenca("Problema do coracao");
        leitor.adicionarDoenca("Colesterou alto");
        leitor.adicionarDoenca("Cancer");

        Medica medica = new Medica(
                "0000000",
                "0000000",
                "Angela",
                "65465465465446"
        );

        Bibliotecario bibliotecario = new Bibliotecario(
                "11111111",
                "1111111",
                "Joy",
                "21da3s1d65s4da65s4d"
        );

        Atendente atendente = new Atendente(
                "2222222",
                "222222",
                "Zefinha"
        );


        Emprestimo emprestimo = new Emprestimo(
                "06-03-2023",
                triagem,
                medica,
                bibliotecario
        );

        emprestimo.adicionarObservacao("Ele ta precisando fazer exercicio e comer");
        emprestimo.receitarMedicacao("Biotonico");

    }
}