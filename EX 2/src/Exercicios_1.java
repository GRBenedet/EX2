import java.util.Scanner;

public class Exercicios_1 {
    //(ExeSelecao01.java) Construa um programa em Java para ler um valor, verificar se é maior do que 100 e mostrar essa informação (DICA: Usar if/else para mostrar se valor é > ou < 100)
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num;
        System.out.println("digite um numero: ");
        num = ler.nextInt();
        
        if(num > 100) {
            System.out.println("o numero é maior que 100");
        }

        else {
            System.out.println("numero não é maior que 100");
        }
    }
}