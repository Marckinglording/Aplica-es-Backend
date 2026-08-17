import java.util.Scanner;

public class CalculoIMC {

    public static void main(String [] args) {

        float peso, altura, imc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso corporal em kg: \n");

        peso = scan.nextFloat();
        scan.nextLine();

        System.out.println("\nInforme a altura em centímetros: \n");

        altura = scan.nextFloat();
        scan.nextLine();

        imc = peso / (altura *altura);

        System.out.printf("IMC = ", imc);
        
        if (imc < 20) {
            System.out.printf("  (Magro)");
        }else if (imc < 24) {
            System.out.printf("  (Normal)");
        }else if (imc < 29) {
            System.out.printf("  (Acima do peso)");
        }else if (imc < 34) {
            System.out.printf("  (Obeso)");
        }else {
            System.out.printf("  (Muito obeso)");
        }

    }
}