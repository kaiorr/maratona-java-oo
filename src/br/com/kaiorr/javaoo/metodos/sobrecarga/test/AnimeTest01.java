package br.com.kaiorr.javaoo.metodos.sobrecarga.test;

import br.com.kaiorr.javaoo.metodos.sobrecarga.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", "TV", 55, "Ação");
        anime.imprime();
    }
}
