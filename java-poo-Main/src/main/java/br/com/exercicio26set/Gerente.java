package br.com.exercicio26SET;

public class Gerente extends Funcionario {
    Double bonusPerformance;
    Double comissao;
    public Gerente(
            String nome,
            String matricula,
            Double salarioBase) {
        super(nome, matricula, salarioBase);
        this.bonusPerformance = 0.0;
        this.comissao = 0.0;
    }

    public double getBonusPerformance(Double bonusPerformance){
        return bonusPerformance;
    }
    public void setBonusPerformance(Double bonusPerformance){
        this.bonusPerformance = bonusPerformance;
    }
    public double getComissao(Double comissao){
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
       }
       @Override
       public double calcularSalario() {

           return salarioBase + bonusPerformance * comissao;
       }
   }
