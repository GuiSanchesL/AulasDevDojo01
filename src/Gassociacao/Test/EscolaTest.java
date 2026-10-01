package Gassociacao.Test;

import Gassociacao.Dominio.Escola;
import Gassociacao.Dominio.Professor;


public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Alfredinho");
        Professor professor2 = new Professor("Julião");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Intellectus",professores);
    }
}
