package IntroduçãoMetodos.Dominio;

public class Calculadora {
    public void somarNumeros(){
    /* Sintaxe de metodos um pouco diferente com os () no final,
    uso do void para não retornar nada "Vazio" porem saida nos testes
     */
        System.out.println(10+10);
    }
    public void SubtrairNumeros(){
        System.out.println(20-19);
    }
    public void multiplicarNumeros(int num1,int num2){
        System.out.println(num1 * num2);
    }

}
