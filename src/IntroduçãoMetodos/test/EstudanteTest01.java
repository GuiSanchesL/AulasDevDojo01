package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Estudante;
import IntroduçãoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 =new Estudante();
        Estudante estudante02 =new Estudante();
        ImpressoraEstudante imprimir=new ImpressoraEstudante();
        estudante02.nome="Flávia";
        estudante02.idade= 41;
        estudante02.sexo='F';
       imprimir.imprime(estudante02);
       System.out.println("-----------------------------");
        estudante01.nome="Andersen";
        estudante01.idade=45;
        estudante01.sexo='M';
        imprimir.imprime(estudante01);


    }

}
