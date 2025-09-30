package br.com.exercicio26SET;

public class SistemaRH{
    public static void main(String[] args){

        //Criando Funcionários - POLIMORFISMO

        Funcionario[] funcionarios = new Funcionario[3];
    Desenvolvedor dev = new Desenvolvedor("ana",
            5000,
            "DEV0001",
            50,
            145.00);

     dev.registrarHoraExtra(10);
     funcionarios[0] = dev;

     Gerente gerente = new Gerente(
             "Carlos",
             "GER001",
             8000.0);
     gerente.setBonusPerformance(1000.0);
     gerente.getComissao(500.0);
     funcionarios[1] = gerente;

     Estagiario estagiario = new Estagiario(
             "Pedro","Est001",15.00);
     estagiario.registrarHoras(35);
     funcionarios[2] = estagiario;

     System.out.println("===FOLHA DE PAGAMENTO ===");
     double totalFolha = 0;
     for (Funcionario func : funcionarios) {
         func.exibirDados();
         totalFolha += func.calcularSalario();
         System.out.println("---");
     }
        System.out.println("TOTAL DA FOLHA: R$ : " + totalFolha);
//DEMONSTRAÇÃO DE POLIMORFISMO
         System.out.println("/n=== DEMONSTRAÇÃO DE POLIMORFISMO");
         for (Funcionario func : funcionarios){
             System.out.println(func.getNome() + "- Salario R$: " + func.calcularSalario());
     }
    }
}
