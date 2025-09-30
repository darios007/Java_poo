package br.com.exercicio26SET;

public class Desenvolvedor extends Funcionario {

    private int horasExtra;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome,
                         double salarioBase,
                         String matricula,
                         int horasExtra,
                         double valorHoraExtra){
        super(nome, matricula, salarioBase);
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;

    }
    public int getHorasExtra(){
        return horasExtra;
    }
    public void setHorasExtra(int horasExtra){
        this.horasExtra = horasExtra;
    }
    public  Double getvalorHoraExtra(){
        return valorHoraExtra;
    }
    public void setValorHoraExtra(Double valorHoraExtra){
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {

        return salarioBase + (valorHoraExtra * horasExtra);
    }

    public void registrarHoraExtra(int horasExtra){
        this.horasExtra += horasExtra;

    }
/*   public class Gerente extends Funcionario{

    public Gerente(String nome, String matricula, Double salarioBase) {
            super(nome, matricula, salarioBase);
        }

        @Override
        public double calcularSalario() {
*
            return 0;
 */
        }
