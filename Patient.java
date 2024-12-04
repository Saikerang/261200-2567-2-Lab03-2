public class Patient {
    private int id;
    String name;
    private int birthYear;
    double height;
    double weight;
    private String bloodGroup;
    private String phoneNumber;

    public Patient (int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber){

        if (height <= 0.0){
            System.out.println("invalid height");
        }else {
            this.height = height;
        }
        if (weight <= 0.0) {
            System.out.println("invalid weight");
        }else {
            this.weight = weight;
        }
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;

        if(bloodGroup .equals("A") || bloodGroup .equals("B")|| bloodGroup .equals("O")|| bloodGroup .equals("AB")){
            this.bloodGroup = bloodGroup;
        } else {
            System.out.println("Invalid bloodGroup");
        }

        if(phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber; //In thailand
        }else {
            this.phoneNumber = null;
            System.out.println("Invalid phoneNumber");
        }

    }


    public int getId() {
        return this.id;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    public String getBloodGroup() {
        return this.bloodGroup;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAge(int x){
        if(x < this.birthYear){
            System.out.println("Invalid age");
            return 0;

        }
        return x - this.birthYear;
    }
    public double getBMI(){
        if(height <= 0 || weight <=0){
            return 0.0;
        } else {
            return weight/((height/100)*(height/100));
        }
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Bloodgroup : " + bloodGroup);
        System.out.println("Patient Phonenumber : " + phoneNumber);
        System.out.println("BMI = (kg/m^2): " + getBMI());
    }

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

