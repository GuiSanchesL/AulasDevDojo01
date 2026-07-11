package AcademyDevDojo;

import java.util.Scanner;

public class votação {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Em que ano voce nasceu ?");
        int nascimento = teclado.nextInt();
        int anoatual=2026;
        int idade=anoatual-nascimento;
        if (idade>=18&&idade>70){
            System.out.println("Obrigado a votar");
        }
        else {
            System.out.println("Voto opcional");
        }

    }
}
