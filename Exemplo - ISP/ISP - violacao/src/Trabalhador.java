// Interface "Gorda" - forçando todas as classes a implementar métodos que não usam.
public interface Trabalhador {
    void trabalhar();
    void almoçar();
    void cozinhar(); // Este método força o Engenheiro a implementá-lo sem necessidade.
}