// PatoDeBorracha implementa APENAS a interface Pato.
// Ele não é obrigado a implementar o método 'voar()'.
public class PatoDeBorracha implements Pato {
    @Override
    public void quack() {
        System.out.println("PatoDeBorracha: Squeak! (som de brinquedo)");
    }

    public static void main(String[] args) {
        // Podemos tratar todos como Pato (polimorfismo LSP)
        Pato patoBorracha = new PatoDeBorracha();
        Pato patoComum = new PatoComum(); // Um PatoVoador também é um Pato

        System.out.println("\n--- Teste com Pato (Interface Base) ---");
        patoBorracha.quack();
        patoComum.quack();

        // Para voar, precisamos garantir que o objeto seja do tipo PatoVoador:
        System.out.println("\n--- Teste de Pato Voador (Aplicando LSP) ---");
        if (patoComum instanceof PatoVoador) {
            ((PatoVoador) patoComum).voar();
        }
        
        // Tentativa de voar com PatoDeBorracha (não passa no instanceof):
        if (patoBorracha instanceof PatoVoador) {
            // Este bloco nunca será executado, o que está correto!
            ((PatoVoador) patoBorracha).voar();
        } else {
            System.out.println("PatoDeBorracha: Não implementa a capacidade de voar. (LSP aplicado!)");
        }
    }
}