package Jmodificadorfinal.Dominio;

public class Vendedor {
    private String name;

    @Override
    public String toString() {
        return "Vendedor{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
