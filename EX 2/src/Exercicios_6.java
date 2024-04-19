import java.util.Scanner;

public class Exercicios_6 {
    //(ExeSelecao06.java) Construa um programa em Java para ler três valores que representam três segmentos de reta. Verificar se com esses segmentos é possível compor um triângulo e mostrar uma mensagem dizendo se é ou não possível. (DICA: Usar if/else e operador lógico &&. Regra para ser um triângulo: (A < B + C) e (B < A + C) e (C < A + B), OU SEJA, todos os lados devem ser menores que a soma dos outros dois lados)

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("defina lado A: ");
        ladoA = ler.nextInt();
        System.out.println("defina lado B: ");
        ladoB = ler.nextInt();
        System.out.println("defina lado c: ");
        ladoC = ler.nextInt();

        if((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoB + ladoA))){
            System.out.println("e seu triangulo é verdadeiro!!!!");
        }

        else{
            System.out.println("seu triangulo é falso");
        }

        
        
    }

}
