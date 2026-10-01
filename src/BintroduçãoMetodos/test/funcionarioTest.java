package BintroduçãoMetodos.test;

import BintroduçãoMetodos.Dominio.Funcionario;

public class funcionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario();
        funcionario.setNome("Anderson");
        funcionario.setIdade(45);
        funcionario.setSalarios(new double [] {1000,500,35000});
        funcionario.imprime();

    }


}
