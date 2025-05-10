package day04.level02.selfproblems.associationandcomposition;

public class Main {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Atul", "D001");
        Doctor doctor2 = new Doctor("Bipul", "D002");

        // Create patients
        Patient patient1 = new Patient("Aman", "P001");
        Patient patient2 = new Patient("Bharat", "P002");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Associate doctors with patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient2);

        // Display hospital details
        hospital.displayDetails();

        // Display doctor and patient relationships
        doctor1.displayPatients();
        doctor2.displayPatients();
        patient1.displayDoctors();
        patient2.displayDoctors();

        // Perform consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor2.consult(patient2);
    }
}
