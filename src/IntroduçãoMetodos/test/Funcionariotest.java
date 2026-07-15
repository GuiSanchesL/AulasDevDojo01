package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Funcionario;

public class Funcionariotest {
    public static void main(String[] args) {
        Funcionario funcionario=new Funcionario();
         funcionario.nome="Guilherme";
         funcionario.idade=19;
         funcionario.salarios= new double[]{1500,1800,200.0};

         funcionario.imprime();

    }

}
