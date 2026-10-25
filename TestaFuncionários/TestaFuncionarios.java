package TestaFuncionários;

public class TestaFuncionarios {

    public static void main(String[] args) {
        
        Gerente g = new Gerente("Marcos", 19.387, "710276", "182001");
        Telefonista t = new Telefonista("Rômulo", 1.938, "565656");
        Secretaria s = new Secretaria("Alef", 2.387, "2121");

        g.mostrarDados();
        t.mostrarDados();
        s.mostrarDados();

    }

}