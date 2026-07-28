package EmPratica.Dominio;

public class AgendaTelefonica {
    public String pessoa;
    public int numero;

    public void imprime(){
        System.out.println(this.pessoa);
        System.out.println(this.numero);
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getPessoa() {
        return pessoa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
