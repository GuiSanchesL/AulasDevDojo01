package IntroduçãoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double nums : salarios) {
            System.out.println(nums);

            double media = nums /salarios.length;
            System.out.println("Media "+ media);
        }
    }
}
