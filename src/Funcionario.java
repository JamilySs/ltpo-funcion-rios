public class Funcionario {

    private String nome;
    private Double salarioBase;
    private int horasTrabalhadas;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double calcularSalarioFinal() {
        int horasNormais = 160;
        double valorHora = salarioBase/ horasNormais;
        if (horasTrabalhadas > horasNormais) {
            int horasExtras = horasTrabalhadas - horasNormais;
            return salarioBase + (horasExtras * valorHora * 1.5);
    }
        return salarioBase;
}
    public void exibirDados() {
        System.out.printf("Funcionário: %s\n", nome);
        System.out.printf("Salário Base: R$%.2f\n", salarioBase);
        System.out.printf("Horas trabalhadas: %d\n", horasTrabalhadas);
        System.out.printf("Salário Final: R$%.2f\n", calcularSalarioFinal());
        System.out.println("--------------------------");
    }
}

