package Heranca.Dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
static{
    System.out.println("Dentro do bloco static pessoa");
}
    {
        System.out.println("Bloco de inicializacao pessoa 1");
    }
    {
        System.out.println("Bloco de inicializacao pessoa 2");

    }
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Dentro do construtor pessoa ");
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
