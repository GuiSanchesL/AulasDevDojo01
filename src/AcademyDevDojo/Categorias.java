package AcademyDevDojo;

import java.util.Scanner;

public class Categorias {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade ? ");
        int idade = teclado.nextInt();
        if (idade < 15){
            System.out.println("Categoria infantil ");
        }else if (idade >= 15 && idade<18){
            System.out.println("Categoria juvenil");
        }else
            System.out.println("Categoria adulto !");
        }

    }


