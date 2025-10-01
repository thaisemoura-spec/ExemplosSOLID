// Main.java
public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        ReportSaver saver = new ReportSaver();
        ReportSender sender = new ReportSender();

        report.generateReport();
        saver.saveToFile("relatorio.txt");
        sender.sendEmail("teste@email.com");
    }
}
