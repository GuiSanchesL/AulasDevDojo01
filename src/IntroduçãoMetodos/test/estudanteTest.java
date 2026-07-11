package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Estudante;
import IntroduçãoMetodos.Dominio.ImpressoraEstudante;

public class estudanteTest {
    public static void main(String[] args) {
        Estudante estudante1=new Estudante();
        Estudante estudante2=new Estudante();
        ImpressoraEstudante imprime=new ImpressoraEstudante();

        estudante1.nome="Luiza";
        estudante1.idade=2026-2007;
        estudante1.sexo='F';
        imprime.impressora(estudante1);
        System.out.println("---------------------------");
        estudante2.nome="Guilherme";
        estudante2.idade=2026-2006;
        estudante2.sexo='M';
        imprime.impressora(estudante2);
    }
}
