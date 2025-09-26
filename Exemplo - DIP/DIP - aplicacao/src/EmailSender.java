// Detalhe 1: Implementa a abstração.
public class EmailSender implements EnviadorDeMensagem {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("--- EMAIL SENDER ---");
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}