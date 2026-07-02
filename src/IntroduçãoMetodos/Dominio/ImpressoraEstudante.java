package IntroduçãoMetodos.Dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        estudante.nome="Flávia";
        estudante.idade= 41;
        estudante.sexo='F';

        estudante.nome="Andersen";
        estudante.idade=45;
        estudante.sexo='M';
    }
}
