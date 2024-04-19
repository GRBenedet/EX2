import java.util.Scanner;

public class Exercicios_8 {
    //(ExeSelecao8.java) Construa um programa em Java para ler três valores para os lados de um triângulo: A, B e C. Verificar se os lados fornecidos formam realmente um triângulo. Se formar, deve ser indicado o tipo de triângulo: isósceles, escaleno ou equilátero. Para verificar se os lados fornecidos formam um triângulo: A < B + C e B < A + C e C < A + B. Triângulo isósceles: possui dois lados iguais (A=B ou A=C ou B=C). Triângulo escaleno: possui todos os lados diferentes (A<>B e B<>C e A<>C). Triângulo equilátero: possui todos os lados iguais (A=B e B=C). (DICA: utilizar “if-else” como estrutura de seleção e o operador lógico &&)
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("defina lado A: ");
        ladoA = ler.nextInt();
        System.out.println("defina lado B: ");
        ladoB = ler.nextInt();
        System.out.println("defina lado c: ");
        ladoC = ler.nextInt();

        if ( (ladoA == ladoB) & (ladoB == ladoC) & (ladoA == ladoC) ) {
            System.out.println("E tambem é isósceles");

        }

        else if ( (ladoA != ladoB) && (ladoB != ladoC) && (ladoA != ladoC) ) {
            System.out.println("E tambem é escaleno");
        }

        if ( (ladoA == ladoB) && (ladoB == ladoC) && (ladoA == ladoC) ) {
            System.out.println("E tambem é equilatero");           
        }

        else if((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoB + ladoA))){
            System.out.println("e seu triangulo é verdadeiro!!!!");
        }

        else{
            System.out.println("seu triangulo é falso");
        }
    }

}
