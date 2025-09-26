// Módulo de Baixo Nível: A classe concreta que lida com o detalhe de envio de e-mail.
public class EmailSenderConcreto {
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}