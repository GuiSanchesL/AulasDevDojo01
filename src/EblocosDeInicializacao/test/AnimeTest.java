package EblocosDeInicializacao.test;

import EblocosDeInicializacao.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto",0);
        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio+  " ");
        }

    }
}
