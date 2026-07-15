package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTest5 {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
       int [] numeros= {1,2,3,4,5};
        //int [] numeros= new int[5];
        calculadora.somarArray(numeros);
        calculadora.somaVargs(1,2,3,4,5,6);
    }
}
