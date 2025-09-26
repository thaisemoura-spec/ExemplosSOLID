// RepositorioFuncionario.java (Nova classe para persistência)
class RepositorioFuncionario {
    public void salvar(Funcionario funcionario) {
        System.out.println("Funcionário " + funcionario.getNome() + " salvo no banco de dados.");
    }
}