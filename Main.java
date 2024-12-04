public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0,"A","0888888888");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "KIM", 1989, 165, 88,"C","0999999999");
        invalidPatient.displayDetails(currentYear);
        Patient bruh = new Patient(1003, "git", 2026, 150, 55,"AB","0008");
        bruh.displayDetails(currentYear);
    }
}