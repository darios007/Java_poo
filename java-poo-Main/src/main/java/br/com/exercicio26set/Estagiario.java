package br.com.exercicio26SET;

public class Estagiario extends  Funcionario{

    private int horasTrabalhadas;
    private Double valorHoraTrabalhada;

    public Estagiario(String nome, String matricula,
                      Double valorHoraTrabalhada){

        super(nome, matricula, 0.0);
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.horasTrabalhadas = 0;
    }

    public void registrarHoras(int horasTrabalhadas){
        this.horasTrabalhadas += horasTrabalhadas;
    }


    @Override
    public double calcularSalario() {
        return 0;
    }
}
