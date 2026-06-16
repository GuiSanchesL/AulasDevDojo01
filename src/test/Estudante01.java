package test;

import Dominio.Estudante;

public class Estudante01 {
    public static void main(String[] args) {
         Estudante estudante=new Estudante();
        estudante.nome="Gabriel";
        estudante.idade=14;
        estudante.sexo='M';
        estudante.altura=1.65;
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.altura);
    }
}
