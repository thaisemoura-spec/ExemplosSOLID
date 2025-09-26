public class ChefDeCozinha implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("ChefDeCozinha: Gerenciando a cozinha.");
    }

    @Override
    public void almoçar() {
        System.out.println("ChefDeCozinha: Provando o menu.");
    }

    // O Chef usa este método.
    @Override
    public void cozinhar() {
        System.out.println("ChefDeCozinha: Preparando o prato principal.");
    }

    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro();
        ChefDeCozinha chef = new ChefDeCozinha();

        System.out.println("--- Teste de Violação ISP ---");
        engenheiro.trabalhar();
        // Chamamos 'cozinhar' no Engenheiro, o que é sem sentido e demonstra a dependência indesejada.
        engenheiro.cozinhar(); 
    }
}