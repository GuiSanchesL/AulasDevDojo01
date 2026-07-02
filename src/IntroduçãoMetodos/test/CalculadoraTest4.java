package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora= new Calculadora();
        int num1=1;
        int num2=2;
        calculadora.alterarDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
