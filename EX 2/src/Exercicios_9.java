import java.util.Scanner;

public class Exercicios_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantLaranjas;
        float valorX, valorY;

        valorX = (float) 0.30;
        valorY = (float) 0.25;

        System.out.println("quantas larajas foram compradas?");
        quantLaranjas = ler.nextInt();

        if (quantLaranjas < 12) {
            System.out.printf(quantLaranjas + " unidades de laranjas no valor de: " + " R$" + (quantLaranjas * valorX) );
        }

        else {
            System.out.printf(quantLaranjas + " unidades de laranjas no valor de: " + "R$" + (quantLaranjas * valorY) );
        }

    }
}
