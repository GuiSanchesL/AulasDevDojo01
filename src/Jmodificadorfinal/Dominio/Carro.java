package Jmodificadorfinal.Dominio;

public class Carro {
    public  String Nome;
    public static final double VELOCIDADE_LIMITE= 250;
    public final Comprador COMPRADOR= new Comprador();
    public final Vendedor VENDEDOR = new Vendedor();

   public final void imprime(){
       System.out.println(this.Nome);
   }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
