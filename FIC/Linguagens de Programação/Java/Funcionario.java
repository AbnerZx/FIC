public class Funcionario extends Pessoa{
    private String nome;
    private int matricula;
    private double salario;
    private String cargo;
    private String departamento;
    
    public Funcionario(String nome_funcionario, int matricula, double salario, String cargo, String departamento) {
        nome = nome_funcionario;
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double darAumento(){
        return this.salario * 1.20;
    }

    public double darAumentoIndividual(double percentual){
        return this.salario * percentual;
    }

}

