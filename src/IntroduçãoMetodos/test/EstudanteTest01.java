package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Estudante;
import IntroduçãoMetodos.Dominio.ImpressoraEstudante;


public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 =new Estudante();
        Estudante estudante02 =new Estudante();
        ImpressoraEstudante imprime=new ImpressoraEstudante();

        estudante01.nome="Flávia";
        estudante01.idade= 41;
        estudante01.sexo='F';
 


       System.out.println("-----------------------------");
        estudante02.nome="Andersen";
        estudante02.idade=45;
        estudante02.sexo='M';



        imprime.imprime(estudante01);
        imprime.imprime(estudante02);


    }

}
