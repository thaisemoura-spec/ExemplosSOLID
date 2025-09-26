// Engenheiro implementa apenas o que ele realmente faz.
public class Engenheiro implements TrabalhadorGeral {
    @Override
    public void trabalhar() {
        System.out.println("Engenheiro: Codificando e projetando.");
    }

    @Override
    public void almoçar() {
        System.out.println("Engenheiro: Fazendo uma pausa para o almoço.");
    }
}