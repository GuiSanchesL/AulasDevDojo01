package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Funcionario;

public class funcionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario();
        funcionario.nome="Anderson";
        funcionario.idade=45;
        funcionario.salarios = new double[] {100,200,300};
        funcionario.imprime();
    }
}
