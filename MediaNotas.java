public class MediaNotas {

    public static void main(String[] args) {

        float nota1, nota2, nota3, media;
        nota1 = 10; nota2 = 8.9F; nota3 = 6;
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média do aluno: " + media);
            
        if(media >= 6) {
            System.out.println("Aluno aprovado!");
        }
        else {
            System.out.println("Aluno reprovado!");
        }

    }
}
