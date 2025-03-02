package day03.level01.hospitalmanagementsystem;

public class Patient {
    public static void main(String [] args){
        HospitalManagementSystem hospital1= new HospitalManagementSystem(01, "B.K. Sharma", 34, "Cancer" );
        HospitalManagementSystem hospital2= new HospitalManagementSystem(03, "Rachit Sharma", 58, "fever" );

        if(hospital1 instanceof HospitalManagementSystem){
            hospital1.displayPatientsDetails();
        }
        if(hospital2 instanceof HospitalManagementSystem){
            hospital2.displayPatientsDetails();
        }
        HospitalManagementSystem.getTotalPatients();

    }


}
