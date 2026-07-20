package IntroduçãoMetodos.Dominio;

public class Pesooa {
    private String nome;
    private int idade;
    private double salario;
    public void setNome(String nome) {
       this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (idade < 0) {
            System.out.println("Idade invalida");
        } else {
            System.out.println(this.idade);
        }
        System.out.println(this.salario);
    }
}
