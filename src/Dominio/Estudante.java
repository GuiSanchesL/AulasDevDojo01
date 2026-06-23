package Dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public double altura;

    public static class Calculadora {
        public void somarNumeros(){
    // Importante! Quando designar o public void, por ser metodos a primeira letra sempre é minuscula
    // Quem começa com maiusculas são classes
            System.out.println(10+10);
        }
    }
}
