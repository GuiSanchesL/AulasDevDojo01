package Associacao.Test;

import Associacao.Dominio.Escola;
import Associacao.Dominio.Professor;


public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alfredinho");
        Professor professor2 = new Professor("Julião");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Intellectus",professores);
        escola.imprime();
    }
}
