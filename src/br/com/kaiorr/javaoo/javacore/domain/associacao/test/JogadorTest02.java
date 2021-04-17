package br.com.kaiorr.javaoo.javacore.domain.associacao.test;

import br.com.kaiorr.javaoo.javacore.domain.associacao.domain.Jogador;
import br.com.kaiorr.javaoo.javacore.domain.associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kaiorr");
        Time time = new Time("Curintia");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
