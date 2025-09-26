public class Engenheiro implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Engenheiro: Codificando e projetando.");
    }

    @Override
    public void almoçar() {
        System.out.println("Engenheiro: Fazendo uma pausa para o almoço.");
    }

    // A violação do ISP: Engenheiro é forçado a ter este método,
    // mas não tem um uso real para ele no contexto de um Engenheiro.
    @Override
    public void cozinhar() {
        System.out.println("Engenheiro: Não sou pago para cozinhar. Implementação vazia.");
    }
}