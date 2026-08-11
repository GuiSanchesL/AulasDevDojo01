package ModificadoresStatics.Dominio;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;
    public Carro(String marca, double VelocidadeMaxima) {

        this.marca = marca;
        this.velocidadeMaxima = VelocidadeMaxima;
    }
public static void setVelocidadeLimite(double velocidadeLimite) {
    Carro.velocidadeLimite = velocidadeLimite;
}

    public void imprime() {
        System.out.println("Nome: "+this.marca);
        System.out.println("Velocidade Maxima:"+this.velocidadeMaxima);
        System.out.println("Velocidade Limite"+Carro.velocidadeLimite);
        System.out.println("------------------------------------------");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        velocidadeMaxima = velocidadeMaxima;
    }

}
