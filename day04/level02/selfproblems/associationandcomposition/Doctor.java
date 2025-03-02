package day04.level02.selfproblems.associationandcomposition;
import java.util.ArrayList;

public class Doctor {
    private String name;
    private String doctorId;
    private ArrayList<Patient> patients;

    // Constructor
    public Doctor(String name, String doctorId) {
        this.name = name;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    // Get doctor name
    public String getName() {
        return name;
    }

    // Get doctor ID
    public String getDoctorId() {
        return doctorId;
    }

    // Add a patient to the doctor's list
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Maintain bidirectional association
        }
    }

    // Consult a patient
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " has no association with patient " + patient.getName());
        }
    }

    // Display all patients of the doctor
    public void displayPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName());
        }
    }

}
