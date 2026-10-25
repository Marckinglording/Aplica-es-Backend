package TestaFuncionários;

public class Gerente extends Funcionario {

    private String usuario;
    private String senha;
    private Double bonificacaoPercentual = 0.2;

    public Gerente (String nome, Double salario, String usuario, String senha) {

        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;

    }

    @Override 
    public Double CalculaBonificacao() {
        return getSalario() + ( getSalario() * bonificacaoPercentual );
    }

    @Override 
    public void mostrarDados() {

        System.out.println("FUNCIONARIOS\n");

        System.out.println("\nGERENTE");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Usuário: " + getUsuario());
        System.out.println("Senha: " + getSenha());
        System.out.println("Bonificação: " + (CalculaBonificacao() - getSalario()) );
        System.out.println("Salário com bonificação: " + CalculaBonificacao());   

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}    