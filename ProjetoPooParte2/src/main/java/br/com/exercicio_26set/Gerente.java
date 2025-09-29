package br.com.exercicio_26set;


public class Gerente extends Funcionario {

    private double bonusPerformance;
    private double comissao;

    public Gerente(
            String nome,
            String matricula,
            double salarioBase){
        super(nome, matricula, salarioBase);
        this.bonusPerformance = 0.0;
        this.comissao = 0.0;
    }
public double getBonusPerformance() {
        return bonusPerformance;
}
public void setBonusPerformance(double bonusPerformance) {
        this.bonusPerformance = bonusPerformance;
}
public double getComissao() {
        return comissao;
}
public void setComissao(double comissao) {
        this.comissao = comissao;
}

    @Override
    public double calcularSalario() {
        return salarioBase + bonusPerformance * comissao;
    }
}
