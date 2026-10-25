package TestaFuncionários;

public class Telefonista extends Funcionario {
    
    private String codigoEstacaoTrabalho;
    
    public Telefonista (String nome, Double salario, String codigoEstacaoTrabalho) {

        super(nome, salario);
        this.codigoEstacaoTrabalho = codigoEstacaoTrabalho;

    }

    @Override 
    public void mostrarDados() {

        System.out.println("FUNCIONARIOS\n");

        System.out.println("\nGERENTE");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Usuário: " + GetCodigoEstacaoTrabalho());
        System.out.println("Bonificação: " + (CalculaBonificacao() - getSalario()) );
        System.out.println("Salário com bonificação: " + CalculaBonificacao());   

    }

    public String GetCodigoEstacaoTrabalho() {
        return codigoEstacaoTrabalho;
    }

    public void SetcodigoEstacaoTrabalho(String codigoEstacaoTrabalho) {
        this.codigoEstacaoTrabalho = codigoEstacaoTrabalho;
    }

}