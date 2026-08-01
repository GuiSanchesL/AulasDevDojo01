package BlocosDeInicializacao.Dominio;

public class Estudante {
    private String nome;
    private int[] notas;
    {
      notas = new int[4];
        System.out.println("Estudante criado");
    }
    public void imprime (){
        System.out.println(this.nome);

    }
    public Estudante(String nome, int [] notas){
        this.nome=nome;
        this.notas=notas;
    }
}
