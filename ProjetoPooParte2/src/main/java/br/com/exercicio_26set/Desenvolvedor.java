package br.com.exercicio_26set;

public class Desenvolvedor extends Funcionario{

    private int horasExtra;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, int horasExtra, Double valorHoraExtra, String matricula) {
        super(nome, matricula, salarioBase);
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;


    }




    @Override
    public double calcularSalario() {
         return salarioBase +(valorHoraExtra * horasExtra);
    }
    public void registrarHorasExtras(int horasExtra){
        this.horasExtra = horasExtra;
    }

}

