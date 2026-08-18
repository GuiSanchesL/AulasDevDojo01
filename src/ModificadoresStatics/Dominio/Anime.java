package ModificadoresStatics.Dominio;

public class Anime {
    private String nome;
    // private int[] episodios;
    private static int[] episodios;

    //0- Bloco de inizializacao é executado quando a jvm carregar a classe
    //1- alocado espaco de memoria pro objeto
    //2- cada atributo de classe ;e criadoe inicializado com valores defalt ou oque for passada
    //3- bloco de inicializacao é executado
    //4- Construtor é executado
   static  {
        System.out.println("Dentro do bloco inicializacao Static ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
   static {
        System.out.println("Dentro do bloco de inicializacao static2");
    }// Os blocos de inicializacao static aparecem na ordem que estao no codigo
    {
        System.out.println("Dentro do bloco de inicializacao nao Static ");
    } //Os blocos de inicializacao nao static tambem podem ser usados junto com os static
    public Anime(String nome, int episodios) {
        this.nome = nome;

    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime() {
        for (int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }
}