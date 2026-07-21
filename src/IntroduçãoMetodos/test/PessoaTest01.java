package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome="luiza";
        //pessoa.idade  =19;
        pessoa.setNome("Luiza");
        pessoa.setIdade(19);


        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
