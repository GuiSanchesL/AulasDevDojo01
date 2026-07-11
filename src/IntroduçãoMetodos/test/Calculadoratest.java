package IntroduçãoMetodos.test;

import Dominio.Estudante;
import IntroduçãoMetodos.Dominio.Calculadora;

import java.util.Scanner;

public class Calculadoratest {
    public static void main(String[] args) {

        Calculadora calculadora=new Calculadora();
        calculadora.somarNumeros(10,5);

     double result= calculadora.divideDoisNumeros(20,5);
        System.out.println(result);

        calculadora.multiplicarNumeros(5,5);

    }

}

