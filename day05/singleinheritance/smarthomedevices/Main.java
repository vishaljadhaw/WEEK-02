package day05.singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {
        // Create instance of subclass
        Device thermostat = new Thermostat(01, "Online", 34);

        // Display the status
        thermostat.displayStatus();
    }

}
