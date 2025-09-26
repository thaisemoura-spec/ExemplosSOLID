// Módulo de Alto Nível: Depende diretamente da classe concreta 'EmailSenderConcreto'.
public class ServicoDeNotificacao {
    // Dependência direta (Alto Nível depende de Baixo Nível)
    private EmailSenderConcreto emailSender; 

    // O construtor é forçado a aceitar um tipo concreto
    public ServicoDeNotificacao() {
        this.emailSender = new EmailSenderConcreto();
    }

    public void notificarUsuario(String usuario, String texto) {
        System.out.println("\nServicoDeNotificacao: Preparando para notificar...");
        
        // A lógica de negócio usa a implementação concreta
        this.emailSender.enviar(usuario, texto);
    }
    
    public static void main(String[] args) {
        // O Serviço está fortemente acoplado ao EmailSenderConcreto.
        ServicoDeNotificacao servico = new ServicoDeNotificacao();
        servico.notificarUsuario("alice@exemplo.com", "Sua senha foi redefinida.");
        
        // Se quisermos usar SMS, teríamos que mudar o código dentro de ServicoDeNotificacao.
    }
}