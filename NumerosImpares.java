public class NumerosImpares {
    
    public static void main(String [] args) {

        int intervalo[] = {1,100};

        System.out.println("\nNúmeros ímpares entre " + intervalo[0] + " e " + intervalo[1] + "\n");

        for(int i = intervalo[0]; i < intervalo[1] + 1; i++) {
            if(i%2 == 1){
                System.out.println(i);
            }
        }
    }
}