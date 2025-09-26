public class PatoDeBorracha extends Pato {
    @Override
    public void quack() {
        System.out.println("PatoDeBorracha: Squeak! (som de brinquedo)");
    }

    // A violação: PatoDeBorracha é obrigado a ter este método,
    // mas não pode voar de verdade. Isso obriga a uma implementação
    // que não faz sentido no contexto do subtipo.
    @Override
    public void voar() {
        // Lançar um erro ou simplesmente não fazer nada (como aqui)
        // demonstra que um PatoDeBorracha não é "substituível" por Pato
        // no contexto do método 'voar()'.
        System.out.println("PatoDeBorracha: Não pode voar.");
    }

    public static void main(String[] args) {
        Pato patoComum = new Pato();
        Pato patoBorracha = new PatoDeBorracha();

        // O código espera que todos os Pato possam voar
        System.out.println("\n--- Teste de Pato Comum ---");
        patoComum.quack();
        patoComum.voar();

        System.out.println("\n--- Teste de Pato de Borracha (Violação) ---");
        patoBorracha.quack();
        // Chamar 'voar()' em PatoDeBorracha é inesperado/problemático
        patoBorracha.voar(); 
    }
}