package EmPratica.Test;

import EmPratica.Dominio.AgendaTelefonica;

public class AgendaTest {
    public static void main(String[] args) {
        AgendaTelefonica Agenda = new AgendaTelefonica();
        Agenda.setPessoa("Guilherme");
        Agenda.setNumero(26313);
        Agenda.imprime();
    }
}
