package IntroduçãoMetodos.Dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

   public void imprime(){
       System.out.println(this.nome);
       System.out.println(this.idade);
      // System.out.println(getNome()); costume ruim chamar o get no imprime, (Metodo)
    //  System.out.println(getIdade());
   }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        if (idade < 0) {
            System.out.println("Idade invalida");
        }
        return this.idade;
    }
}
