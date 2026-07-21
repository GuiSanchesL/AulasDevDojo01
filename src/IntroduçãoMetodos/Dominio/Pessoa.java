package IntroduçãoMetodos.Dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome= nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (idade<0){
            System.out.println("Idade invalida");
        }else{
            System.out.println(this.idade);
        }
    }
}
