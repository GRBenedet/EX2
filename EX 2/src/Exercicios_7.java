import java.util.Scanner;

public class Exercicios_7 {
    //(ExeSelecao07.java) Escreva um programa em Java para ler o número de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. (DICA: regra de três para calcular o percentual de cada voto em relação ao número de eleitores que é 100%, ou seja, X = (brancos ou nulos ou validos) * 100 / eleitores)

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numEleitores, numBranco, numValido, numNulos, numNaovotos;

        System.out.println("qual foi o numero de eleitores de seu municipio?");
        numEleitores = ler.nextInt();
        System.out.println("quantos votos brancos?");
        numBranco = ler.nextInt();
        System.out.println("quantos nulos?");
        numNulos = ler.nextInt();
        System.out.println("quantos validos?");
        numValido = ler.nextInt();


        numNaovotos = (numEleitores - (numBranco + numNulos + numValido));

        numEleitores = (numEleitores - numNaovotos);
        
        numBranco = ((numBranco * 100)/numEleitores);
        numNulos = ((numNulos * 100)/numEleitores);
        numValido = ((numValido * 100)/numEleitores);

        System.out.println("resultado?");
        System.out.println(numBranco + "% de votos Brancos");
        System.out.println(numNulos + "% de votos nulos");
        System.out.println(numValido + "% de votos validos");
        

        
    }
}
