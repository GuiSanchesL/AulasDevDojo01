package IntroduçãoMetodos.test;

import IntroduçãoMetodos.Dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
        //A linha 9 so funciona se voçê colocar os dois numeros no espaço de memoria
        calculadora.multiplicarNumeros(5,2);
    }
}
