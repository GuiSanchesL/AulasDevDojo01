package ModificadoresStatics.Test;

import ModificadoresStatics.Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porche",354);
        Carro carro2 = new Carro("Mercedes",280);
        Carro carro3 = new Carro("Bentley",286);
    ;
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}