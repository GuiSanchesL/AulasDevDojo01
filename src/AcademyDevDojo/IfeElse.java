package AcademyDevDojo;

import java.util.Scanner;

public class IfeElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade ?");
        int idade = teclado.nextInt();
        if (idade >= 18) {
            System.out.println("Pode comprar bebida alcolica !");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}


