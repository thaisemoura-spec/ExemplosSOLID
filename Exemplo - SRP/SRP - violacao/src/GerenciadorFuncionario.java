// GerenciadorFuncionario.java
class GerenciadorFuncionario {
    public double calcularSalario(Funcionario funcionario) {
        System.out.println("Calculando salário de " + funcionario.getNome());
        return 0.0;
    }

    public void salvarFuncionario(Funcionario funcionario) {
        System.out.println("Salvando funcionário " + funcionario.getNome() + " no banco de dados.");
    }
}