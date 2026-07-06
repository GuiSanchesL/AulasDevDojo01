package IntroduçãoMetodos.Dominio;

public class Calculadora {
    public void somarNumeros(int num1, int num2){
    /* Sintaxe de metodos um pouco diferente com os () no final,
    uso do void para não retornar nada "Vazio" porem saida nos testes
     */
        System.out.println(num1 + num2);
    }
    public void SubtrairNumeros(){
        System.out.println(20-1);
     }
    public void multiplicarNumeros(int num1,int num2){
        System.out.println(num1 * num2);
   // Metodo de multiplicação1
    }
    public double divideDoisNumeros(double num1,double num2){
        if (num2==0){
            System.out.println("Não existe divisao por zero!.");
            return 0;
        }else {
            return num1/num2;
        }
        /* Aqui usei o return somente para nâo dar nenhum erro de compilação
        ja que se precisa dar um retorno, nesse caso quem "Chamar" esse metodo vai retornar zero
         */
    }
    public void alterarDoisNumeros(int num1, int num2){
        num1=99;
        num2=33;
        System.out.println(num1);
        System.out.println(num2);
    }


}
