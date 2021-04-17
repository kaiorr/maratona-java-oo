package br.com.kaiorr.javaoo.javacore.domain.associacao.test;

import br.com.kaiorr.javaoo.javacore.domain.associacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldo");
        Jogador jogador2 = new Jogador("Bruxo");
        Jogador jogador3 = new Jogador("Robozão");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
