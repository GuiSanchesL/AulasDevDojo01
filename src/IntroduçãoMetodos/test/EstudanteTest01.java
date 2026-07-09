package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Estudante;
import IntroduçãoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante imprime = new ImpressoraEstudante();

        estudante1.nome = "Gon";
        estudante1.idade = 14;
        estudante1.sexo = 'M';
        imprime.Impressora(estudante1);

        System.out.println("=====================");

        estudante2.nome = "Kilua";
        estudante2.idade = 13;
        estudante2.sexo = 'M';
        imprime.Impressora(estudante2); //
    }
}