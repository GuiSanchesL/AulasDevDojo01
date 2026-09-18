package Heranca.Test;

import Heranca.Dominio.Funcionario;
import Heranca.Dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Guilherme","1676122308");
        pessoa.imprime();
        System.out.println("--------------------------");
        Funcionario funcionario = new Funcionario("Gil","00011123407",100);
        funcionario.imprime();

    }
}
