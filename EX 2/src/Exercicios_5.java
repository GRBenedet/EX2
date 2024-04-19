import java.util.Scanner;

public class Exercicios_5 {
    //(ExeSelecao05.java) Construa um programa em Java para ler um valor, verificar se está no intervalo (100, 200) e mostrar essa informação. (DICA: Usar if/else e operador lógico &&)
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, condicao1, condicao2;

        condicao1 = 100;
        condicao2 = 200;
        
        System.out.println("Digite um numero entre 100 e 200:   ");
        num1 = ler.nextInt();

        if((num1 > 100)&&(num1 < 200)){
            System.out.println("Verdadeiro");

        }

        else{
            System.out.println("Falso");
        }
    }
}
