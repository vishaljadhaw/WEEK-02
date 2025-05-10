package day04.level02.selfproblems.associationandcomposition;

import java.util.ArrayList;
public class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display hospital details
    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - " + doctor.getName() + " (ID: " + doctor.getDoctorId() + ")");
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName() + " (ID: " + patient.getPatientId() + ")");
        }
    }

}
