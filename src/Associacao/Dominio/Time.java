package Associacao.Dominio;

public class Time {
    private String nome;
    private Jogador [] jogadores;
    public Time(String nome) {
        this.nome=nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
