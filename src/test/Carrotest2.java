package test;

import Dominio.Carro;

import java.util.Scanner;

public class Carrotest2 {
    public static void main(String[] args) {
        Carro carro =new Carro();
        Scanner teclado=new Scanner(System.in);
        System.out.println("Qual é o seu carro ?");
        carro.nome= teclado.next();
        System.out.println("Qual o ano do seu Carro ?");
        carro.ano= teclado.nextInt();
        if (carro.ano>2010){
            System.out.println("Carro novo ");
        }else{
            System.out.println("Carro velho");
        }
        System.out.println("Qual o modelo ?");
        carro.modelo= teclado.next();
        System.out.println("Ok, Seu carro é um "+carro.nome+" com o ano "+carro.ano+" e o modelo "+carro.modelo);


    }
}
