package Associacao.Test;

import Associacao.Dominio.Jogador;
import Associacao.Dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Santos");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
