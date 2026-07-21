package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Pesooa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pesooa pessoa = new Pesooa();
        //pessoa.nome="luiza";
        //pessoa.idade  =19;
        pessoa.setNome("Luiza");
        pessoa.setIdade(18);
        pessoa.setSalario(15.000);
        pessoa.imprime();
    }
}
