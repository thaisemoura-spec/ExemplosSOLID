// Chef implementa ambas as interfaces, pois usa todos os métodos.
public class ChefDeCozinha implements TrabalhadorGeral, Cozinheiro {
    @Override
    public void trabalhar() {
        System.out.println("ChefDeCozinha: Gerenciando a cozinha.");
    }

    @Override
    public void almoçar() {
        System.out.println("ChefDeCozinha: Provando o menu.");
    }

    @Override
    public void cozinhar() {
        System.out.println("ChefDeCozinha: Preparando o prato principal.");
    }

    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro();
        ChefDeCozinha chef = new ChefDeCozinha();

        System.out.println("\n--- Teste de Aplicação ISP ---");
        
        // Chamadas permitidas e lógicas para o Engenheiro (só pode trabalhar e almoçar)
        engenheiro.trabalhar();
        engenheiro.almoçar();

        // O compilador garante que não podemos chamar 'engenheiro.cozinhar()'
        // porque o Engenheiro não implementa a interface Cozinheiro.

        System.out.println("\n--- Teste de Chef (Implementa tudo) ---");
        chef.trabalhar();
        chef.cozinhar(); // Chamada lógica e permitida

        System.out.println("\nISP Aplicado: O Engenheiro não é forçado a implementar ou saber sobre 'cozinhar'.");
    }
}