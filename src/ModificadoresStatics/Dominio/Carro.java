package ModificadoresStatics.Dominio;

public class Carro {
    private String marca;
    private double VelocidadeMaxima;
    public static double VelocidadeLimite = 250;

    public Carro(String marca, double VelocidadeMaxima) {

        this.marca = marca;
        this.VelocidadeMaxima = VelocidadeMaxima;
    }

    public void imprime() {
        System.out.println(this.marca);
        System.out.println(this.VelocidadeMaxima);
        System.out.println(Carro.VelocidadeLimite); // Claude me explica do porque o uso do this aqui ser uma acao ruim
        System.out.println("------------------------------------------");
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }

}
