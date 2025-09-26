// Esta classe agora apenas orquestra as operações.
class GerenciadorFuncionario {
    public void gerenciar(Funcionario funcionario) {
        CalculadoraSalario calculadora = new CalculadoraSalario();
        double salario = calculadora.calcular(funcionario);

        RepositorioFuncionario repositorio = new RepositorioFuncionario();
        repositorio.salvar(funcionario);

        System.out.println("Salário calculado e funcionário salvo.");
    }
}