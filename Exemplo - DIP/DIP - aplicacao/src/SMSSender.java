// Detalhe 2: Outra implementação que também depende da abstração.
public class SMSSender implements EnviadorDeMensagem {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("--- SMS SENDER ---");
        System.out.println("Enviando SMS para número: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}