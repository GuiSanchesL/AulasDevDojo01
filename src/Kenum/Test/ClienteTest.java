package Kenum.Test;

import Kenum.Dominio.Cliente;
import Kenum.Dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Andersen", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Guilherme",TipoCliente.PESSOA_FISICA );
        Cliente cliente3 = new Cliente("Gabishow", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Flavia", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);


 /*  Cliente[] clientes = {cliente, cliente2};
        for (Cliente c : clientes) {
            System.out.println(c);
        }*/
    }
}
