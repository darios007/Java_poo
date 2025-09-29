package br.com.exercicio_26set;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

            public Funcionario(String nome, String matricula, Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
            }

            public String getNome() {
                return nome;
            }
            public void setNome(String nome) {
                this.nome = nome;
            }
            public void setMatricula(String matricula) {
                this.matricula = matricula;
            }
            public Double getSalarioBase() {
                return salarioBase;
            }
            public void setSalarioBase(Double salarioBase) {
                this.salarioBase = salarioBase;
            }
            public String getMatricula() {
                return matricula;
            }

            // Metodo abstrato para ser implementado nas subclasses
            public abstract double calcularSalario();



            // metodo abstarto deve ser implementado pela subclasse
    public void exibirDados(){
                System.out.println("Nome:" + nome);
                System.out.println("Matricula:" + matricula);
                System.out.println("Salario:" + salarioBase);
                System.out.println("Salario Final R$" +calcularSalario());
    }


}


