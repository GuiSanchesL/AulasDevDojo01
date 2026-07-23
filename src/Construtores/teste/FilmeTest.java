package Construtores.teste;

import SobrecargaDeMetodos.dominio.Filmes;

public class FilmeTest {
    public static void main(String[] args) {
        Filmes filmes = new Filmes();
        //filmes.inicializacao("HunterXhunter","Anime",500);
        filmes.inicializacao("HunterXHunter", "Anime", "Aventura", 500);
        filmes.imprime();

    }
}
