package br.com.kaiorr.javaoo.javacore.domain.blocosinicializacao.test;

import br.com.kaiorr.javaoo.javacore.domain.blocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio: anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
