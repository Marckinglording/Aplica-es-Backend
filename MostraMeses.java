public class MostraMeses {
    
    public static void main(String[] args) {
        
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("=================");
        System.out.println("Mês- Nome do mês");
        System.out.println("=================");

        for(int i = 0; i < meses.length; i++) {

            System.out.printf("%02d", (i + 1));
            System.out.println("- " + meses[i]);
        }

        System.out.println("=================");
        
    }
}