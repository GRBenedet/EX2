import java.util.Scanner;

public class Exercicios_2 {
    //(ExeSelecao02.java) Construa um programa em Java para ler um valor, verificar se é par  ou ímpar e mostrar essa informação. (DICA:  Usar if/else e o operador aritmético % para mostrar se valor é par ou ímpar. Ex. (valor % 2 == 0) é par...)

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("digite um numero: ");
        num = ler.nextInt();

        if(num %2==0){
            System.out.println("numero é par.");
        } 
        else {
            System.out.println(" numero não é par.");
        }
    }
}
