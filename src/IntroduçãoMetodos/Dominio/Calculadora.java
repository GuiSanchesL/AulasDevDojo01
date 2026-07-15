package IntroduçãoMetodos.Dominio;

public class Calculadora {
    public void somarNumeros(int num1, int num2) {
    /* Sintaxe de metodos um pouco diferente com os () no final,
    uso do void para não retornar nada "Vazio" porem saida nos testes
     */
    }
        public void somarArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
            System.out.println(soma);
    }
        public void somaVargs(int ... numeros){
        int soma=0;
        for(int num : numeros){
            soma += num;
        }
            System.out.println(soma);
    }
1
    public void multiplicarnumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
}
