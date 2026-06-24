package test;

import Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "JEEP COMPASS S";
        carro1.modelo = "S.U.V";
        carro1.ano = 2019;

       // carro1=carro2; uso da Referencia de objeto

        carro2.nome= "Citroen C3";
        carro2.modelo="Hatch";
        carro2.ano=2026;

        System.out.println(carro1.nome+" "+carro1.modelo+" "+carro1.ano);
        System.out.println("-----------------------------------------------");
        System.out.println(carro2.nome+" "+carro2.modelo+" "+carro2.ano);


    }
}