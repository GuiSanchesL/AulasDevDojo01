package Jmodificadorfinal.Test;

import Jmodificadorfinal.Dominio.Carro;
import Jmodificadorfinal.Dominio.Comprador;
import Jmodificadorfinal.Dominio.Ferrari;
import Jmodificadorfinal.Dominio.Vendedor;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        Vendedor vendedor2 = new Vendedor();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        carro.VENDEDOR.setName("Anderson");
        System.out.println(carro.VENDEDOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("458 Spyder");
        ferrari.imprime();

    }
}
