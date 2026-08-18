import java.util.Scanner;

public class Triangulos {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        float ladoA, ladoB, ladoC;

        System.out.println("Teste de tipo de triângulos");

        System.out.println("Insira os valores de cada lado: ");

        System.out.println("\nlado A: ");
        ladoA = scan.nextFloat();
        scan.nextLine();

        System.out.println("\nlado B: ");
        ladoB = scan.nextFloat();
        scan.nextLine();

        System.out.println("\nlado C: ");
        ladoC = scan.nextFloat();
        scan.nextLine();

        if ((ladoA != 0) && (ladoB != 0) && (ladoC != 0)) {

            if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)) {

                if ((ladoA != ladoB)  && (ladoA != ladoC) && (ladoB != ladoC)) {

                    System.out.println("É um triângulo escaleno");
                    
                } else if ((ladoA == ladoB) || (ladoB == ladoC)) {

                    System.out.println("É um triângulo equilátero");
                        
                } else {

                System.out.println("É um triângulo isósceles");

                }
                
            } else {

            System.out.println("Os valores não formam um triângulo");

            }

        } else {

            System.out.println("Os valores não formam um triângulo");


        }
    }
}