import java.util.Scanner;

public class Exercicios_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quant, numero;
        float valorXbanana = (float) 0.30, valorYbanana = (float) 0.25, valorXMaca = (float) 0.50, valorYMaca = (float) 0.45, valorXlaranja = (float) 0.40, valorYlaranja = (float) 0.35, valorXKiwi = (float) 0.40, valorYKiwi = (float) 0.30;

        System.out.printf( "------ lista de produtos -----%n" + "1. Banana -> R$ " + valorXbanana + "'preço granel' ou R$ " + valorYbanana + "preço duzia ou mais %n" + "2. maçã -> R$ " + valorXMaca + "'preço granel' ou R$ " + valorYMaca + "preço duzia ou mais %n" + "3. Laranja -> R$ " + valorXlaranja + "'preço granel' ou R$ " + valorYlaranja + "preço duzia ou mais %n" + "4. Kiwi -> R$ " + valorXKiwi + "'preço granel' ou R$ " + valorYKiwi + "preço duzia ou mais %n" + "digite o numero do produto que dejesa ou digite '-1' para sair %n");

        numero = ler.nextInt();
        switch (numero) {
            case 1:
                System.out.printf("você escolheu bananas %n" + "quantas bananas deseja? %n");
                quant = ler.nextInt();

                if (quant < 12) {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de bananas no valor de: " + " R$ " + (quant * valorXbanana) );
                }
                else {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de bananas no valor de: " + "R$ " + (quant * valorYbanana) );
                }
                break;
            case 2:
                System.out.printf("você escolheu maçãs %n" + "quantas maçãs deseja? %n");
                quant = ler.nextInt();

                if (quant < 12) {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de maçãs no valor de: " + "R$ " + (quant * valorXMaca) );
                }
                else {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de maçãs no valor de: " + "R$ " + (quant * valorYMaca) );
                }
            break;
            case 3:
                System.out.printf("você escolheu laranjas %n" + "quantas laranjas deseja? %n");
                quant = ler.nextInt();

                if (quant < 12) {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de laranjas no valor de: " + " R$ " + (quant * valorXlaranja) );
                }
                else {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de laranjas no valor de: " + "R$ " + (quant * valorYlaranja) );
                }
                break;
            case 4:
                System.out.printf("você escolheu kiwi %n" + "quantas kiwi deseja? %n");
                quant = ler.nextInt();

                if (quant < 12) {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de kiwis no valor de: " + " R$ " + (quant * valorXKiwi) );
                }
                else {
                    System.out.printf("------ Valor de Compra ------%n" + quant + " unidades de kiwis no valor de: " + "R$ " + (quant * valorYKiwi) );
                }
                break;
            default:
            System.out.println("finalizado");
                break;
        }



    }
}
