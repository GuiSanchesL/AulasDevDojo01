package Construtores.Dominio;

public class Filmes {
    private String nome;
    private int episodios;
    private String classificacao;
    private String genero;
    private String estudio;

    public Filmes(String nome, int episodios, String classificacao, String genero){
        this();
        this.nome = nome;
        this.classificacao=classificacao;
        this.episodios=episodios;
        this.genero = genero;


    }

    public Filmes(String nome, int episodios, String classificacao, String genero,String estudio){
        this(nome, episodios, classificacao, genero);
        this.estudio=estudio;

    }

    public Filmes() {

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.classificacao);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void init(String nome, int episodios, String classificacao) {
        this.nome = nome;
        this.genero = genero;
        this.classificacao = classificacao;
        this.episodios = episodios;
    }

    public void init(String nome, int episodios, String classificacao, String genero) {
        this.nome = nome;
        this.classificacao=classificacao;
        this.episodios=episodios;
        this.genero = genero;
        System.out.println("Fim");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setClassificacao() {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }
}
