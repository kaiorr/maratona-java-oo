package br.com.kaiorr.javaoo.javacore.domain.associacao.test;

import br.com.kaiorr.javaoo.javacore.domain.associacao.domain.Jogador;
import br.com.kaiorr.javaoo.javacore.domain.associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ribeiro");
        Jogador jogador2 = new Jogador("Rocha");
        Jogador jogador3 = new Jogador("Kaio");
        Jogador jogador4 = new Jogador("New Player");
        Time time = new Time("Barcelona");
        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4};
        jogador1.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("Jogador " );

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        jogador4.imprime();

        time.imprime();


    }
}
