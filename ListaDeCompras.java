public class ListaDeCompras {
    
    public static void main(String [] args) {

        String produtos[] = {"Arroz", "Feijão", "Açúcar", "Café"};
        double precosA[] = {15.88, 10.67, 13.90, 16.00};
        double precosB[] = {16.99, 13.99, 14.88, 10.99};

        System.out.println("Lista de compras: \n");
        System.out.println("Produto:         Supermercado A:         Supermercado B:");

        for(int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i] + "                 " + precosA[i] + "                 " + precosB[i]);
        }
    }
}