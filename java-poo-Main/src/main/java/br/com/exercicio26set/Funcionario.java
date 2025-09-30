package br.com.exercicio26SET;

public abstract  class Funcionario {
    protected String nome;
    protected String matricula;
    protected Double salarioBase;

    public Funcionario(String nome, String matricula, Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
public String getNome(){
            return nome;
        }
public void setNome(String nome){
            this.nome = nome;
        }
public String getMatricula(){
        return matricula;
    }
 public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
public Double getsalarioBase(){
            return salarioBase;
        }
public void setSalarioBase(Double salarioBase) {
            this.salarioBase = salarioBase;

        }
//MÉTODO ABSTRATO PARA SER IMPLEMENTADO NAS SUBCLASSES
public abstract double calcularSalario();


// método abstrato deve ser implementado pelas subclasses
public void exibirDados(){
  System.out.println("nome: " + nome);
  System.out.println("Matricula: " + matricula);
  System.out.println("Salário Base: " + salarioBase);
  System.out.println("Salário Final R$:" + calcularSalario());
    }

}
