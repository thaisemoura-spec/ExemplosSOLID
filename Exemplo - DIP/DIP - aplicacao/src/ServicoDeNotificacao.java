// Módulo de Alto Nível: Agora depende APENAS da abstração (Interface).
public class ServicoDeNotificacao {
    // Dependência de Abstração
    private EnviadorDeMensagem enviador; 

    // Injeção de Dependência via Construtor
    // O Serviço de Notificação NÃO sabe qual é a classe concreta, só sabe que é um EnviadorDeMensagem.
    public ServicoDeNotificacao(EnviadorDeMensagem enviador) {
        this.enviador = enviador; // Recebe a abstração
    }

    public void notificarUsuario(String usuario, String texto) {
        System.out.println("\nServicoDeNotificacao: Preparando para notificar...");
        
        // A lógica de negócio usa o método da interface.
        this.enviador.enviar(usuario, texto);
    }
    
    public static void main(String[] args) {
        // 1. Caso E-mail: Injetamos a implementação de e-mail
        EnviadorDeMensagem emailImpl = new EmailSender();
        ServicoDeNotificacao servicoEmail = new ServicoDeNotificacao(emailImpl);
        servicoEmail.notificarUsuario("bob@exemplo.com", "Pagamento aprovado.");
        
        System.out.println("\n------------------------------------");

        // 2. Caso SMS: Injetamos a implementação de SMS
        EnviadorDeMensagem smsImpl = new SMSSender();
        // Reutilizamos a classe ServicoDeNotificacao sem nenhuma alteração!
        ServicoDeNotificacao servicoSms = new ServicoDeNotificacao(smsImpl);
        servicoSms.notificarUsuario("99999-0000", "Lembrete: Reunião às 14h.");
        
        System.out.println("\nDIP Aplicado: O módulo de alto nível (ServicoDeNotificacao) é independente dos detalhes de baixo nível (EmailSender/SMSSender).");
    }
}