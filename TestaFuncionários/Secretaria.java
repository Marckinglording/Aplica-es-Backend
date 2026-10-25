package TestaFuncionários;

public class Secretaria extends Funcionario{
    
    private String ramal;

    public Secretaria (String nome, Double salario, String ramal) {

        super(nome, salario);
        this.ramal = ramal;

    }

    @Override 
    public void mostrarDados() {

        System.out.println("FUNCIONARIOS\n");

        System.out.println("\nGERENTE");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Usuário: " + getRamal());
        System.out.println("Bonificação: " + (CalculaBonificacao() - getSalario()) );
        System.out.println("Salário com bonificação: " + CalculaBonificacao());   

    }


    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }
    
}