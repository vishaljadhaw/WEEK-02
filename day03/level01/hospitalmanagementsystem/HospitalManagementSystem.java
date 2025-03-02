package day03.level01.hospitalmanagementsystem;

public class HospitalManagementSystem {
    static String hospitalName="City Hospital";
    static int totalPatientCounts;
    private String patientName;
    private int patientAge;
    private String patientAilment;
    final int patientID;

    HospitalManagementSystem(int patientID,String patientName, int patientAge, String patientAilment){
        this.patientID = patientID;
        this.patientName=patientName;
        this.patientAge = patientAge;
        this.patientAilment = patientAilment;
        totalPatientCounts++;
    }

    static void getTotalPatients(){
        System.out.println("Total patients: " + totalPatientCounts);
    }

    void displayPatientsDetails(){
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Patient Aliment: " + patientAilment);
    }

}
