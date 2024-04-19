import java.util.Scanner;

public class Exercicios_3 {
    //3. (ExeSelecao03.java) Construa um programa em Java para ler dois valores e mostrar o maior deles. (DICA: Usar if/else para mostrar o maior dos valores digitados)
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;

            System.out.println("Digite um numero: ");
            num1 = ler.nextInt();

            System.out.println("Digite um numero: ");
            num2 = ler.nextInt();

        if(num1 > num2){
            System.out.printf("este é o numero maior: %d", num1);
        }

        else if(num1 == num2){
            System.out.println("Estes numeros são iguais!!!");
        }

        else{
            System.out.printf("este é o numero maior: %d", num2);
        }

    }
    // tentei usar Allray e for para fazer uma repetição mas não consegui comparar os elementos do Allray.



}


