public class NumerosPares {
    
    public static void main(String [] args) {

        int intervalo[] = {10, 40};

        System.out.println("\nNúmeros pares entre " + intervalo[0] + " e " + intervalo[1] + "\n");

        for(int i = intervalo[0]; i < intervalo[1] + 1; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}