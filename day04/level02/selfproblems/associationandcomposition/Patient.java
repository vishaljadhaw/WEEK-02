package day04.level02.selfproblems.associationandcomposition;
import java.util.ArrayList;

public class Patient {
    private String name;
    private String patientId;
    private ArrayList<Doctor> doctors;

    // Constructor
    public Patient(String name, String patientId) {
        this.name = name;
        this.patientId = patientId;
        this.doctors = new ArrayList<>();
    }

    // Get patient name
    public String getName() {
        return name;
    }

    // Get patient ID
    public String getPatientId() {
        return patientId;
    }

    // Add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Display all doctors for the patient
    public void displayDoctors() {
        System.out.println("Patient " + name + "'s Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName());
        }
    }
}
