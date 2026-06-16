package test;

import Dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor=new Professor();
        professor.nome="Rayol";
        professor.idade= 43;
        professor.sexo='M';
        System.out.println(professor.nome + "  " + professor.idade+ "  " + professor.sexo);
    }

}
