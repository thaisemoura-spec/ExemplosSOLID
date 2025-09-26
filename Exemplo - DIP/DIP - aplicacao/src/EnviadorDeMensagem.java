// Abstração: Define o contrato para qualquer forma de envio de mensagem.
public interface EnviadorDeMensagem {
    void enviar(String destinatario, String mensagem);
}