// PatoComum implementa PatoVoador, logo, ele pode quack() e voar()
public class PatoComum implements PatoVoador {
    @Override
    public void quack() {
        System.out.println("PatoComum: Quack!");
    }

    @Override
    public void voar() {
        System.out.println("PatoComum: Voando...");
    }
}