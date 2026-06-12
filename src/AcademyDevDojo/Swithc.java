package AcademyDevDojo;

import java.util.Scanner;

public class Swithc {
    private static String Systeam;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte dia;
        System.out.println("A partir de que dia ? domingo dia 1");
        switch (teclado.nextByte()) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;



        }

    }


}
 /* Se por exemplo eu tivesse um problema de digitar todos os dias da semana o
   swith seria utilizado dessa forma*/
   /* public static void main(String[] args) {
        byte day=5;
        if (day==1){
            System.out.println("Domingo");
        } else if (day==2){
            System.out.println("Segunda");
        }
    }*/
