package Heranca.Dominio;

public class Funcionario extends Pessoa {
    protected int salario;

    public Funcionario(String nome, String cpf,int salario){
        super(nome, cpf);
        this.salario=salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
