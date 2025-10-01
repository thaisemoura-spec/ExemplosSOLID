// Main.java
public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.generateReport();
        report.saveToFile("relatorio.txt");
        report.sendEmail("teste@email.com");
    }
}
