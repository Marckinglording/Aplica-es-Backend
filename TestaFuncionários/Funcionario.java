package TestaFuncionários;

public class Funcionario {

    private String nome;
    private Double salario;
    private Double bonificacaoPercentual = 0.1;

    public Funcionario(String nome, Double salario) {

        this.nome = nome;
        this.salario = salario;
    }

    public Double CalculaBonificacao() {
        return getSalario() + ( getSalario() * bonificacaoPercentual );
    }

    public void mostrarDados() {

        System.out.println("FUNCIONARIOS\n");

        System.out.println("\nFUNCIONARIO");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Bonificação: " + (CalculaBonificacao() - getSalario()) );
        System.out.println("Salário com bonificação: " + CalculaBonificacao());   

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double novoSalario) {
        this.salario = novoSalario;
    }

    public Double getBonificacaoPercentual() {
        return bonificacaoPercentual;
    }

    public void setBonificacaoPercentual(Double novaBonificacao) {
        this.bonificacaoPercentual = novaBonificacao;
    }

}