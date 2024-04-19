import java.util.Scanner;

public class Exercicios_4 {
    //(ExeSelecao04.java) Construa um programa em Java para ler dois valores e mostrar o menor deles. (DICA: Usar if/else para mostrar o menor dos valores digitados)

     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;

            System.out.println("Digite um numero: ");
            num1 = ler.nextInt();

            System.out.println("Digite um numero: ");
            num2 = ler.nextInt();

        if(num1 < num2){
            System.out.printf("este é o numero menor: %d", num1);
        }

        else if(num1 == num2){
            System.out.println("Estes numeros são iguais!!!");
        }

        else{
            System.out.printf("este é o numero menor: %d", num2);
        }

    }
}
