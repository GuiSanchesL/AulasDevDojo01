package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Estudante;
import IntroduçãoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1=new Estudante();
        Estudante estudante2=new Estudante();

        ImpressoraEstudante imprime=new ImpressoraEstudante();

        estudante1.nome="Gabriel";
        estudante1.idade=14;
        estudante1.sexo='M';
         imprime.impressora(estudante1);
        System.out.println("--------------------------");
        estudante2.nome="Guilherme";
        estudante2.idade=19;
        estudante2.sexo='M';
        imprime.impressora(estudante2);
    }
}
