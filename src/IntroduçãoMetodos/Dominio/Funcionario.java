package IntroduçãoMetodos.Dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

        public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double nums : salarios) {
            System.out.println(nums);

            double media = nums /salarios.length;
            System.out.println("Media "+ media);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
