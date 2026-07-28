package BlocosDeInicializacao.Dominio;

public class Anime {
    private String nome;
    // private int[] episodios;
    private int[] episodios;
    //1 alocado espaco de memoria pro objeto
    //2cada atributo de classe ;e criadoe inicializado com valores defalt ou oque for passada
    //3 bloco de inicializacao é executado
    //4 Construtor é executado
    {
        System.out.println("Dentro do bloco inicializacao");
    }

    public Anime(String nome,int episodios) {
        this.nome = nome;

    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodios : this.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }
}