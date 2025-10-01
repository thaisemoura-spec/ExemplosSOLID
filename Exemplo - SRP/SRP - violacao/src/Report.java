// Report.java
public class Report {
    public void generateReport() {
        System.out.println("Gerando relatório...");
    }

    public void saveToFile(String filename) {
        System.out.println("Salvando relatório no arquivo: " + filename);
    }

    public void sendEmail(String email) {
        System.out.println("Enviando relatório para o e-mail: " + email);
    }
}