package BlocosDeInicializacao.Dominio;

public class Estudante {
    private String nome;
    private int notas;

    public void imprime (){
        System.out.println(this.nome);

    }
    public Estudante(String nome, int [] notas){
        this.nome=nome;

    }
}
