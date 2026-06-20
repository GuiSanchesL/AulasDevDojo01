package test;

import Dominio.Carro;

import java.util.Scanner;

public class Carrotest2 {
    public static void main(String[] args) {
        Carro carro =new Carro();
        Scanner teclado=new Scanner(System.in);
        System.out.println("Qual é o seu carro ?");
        carro.nome= teclado.next();

    }
}
