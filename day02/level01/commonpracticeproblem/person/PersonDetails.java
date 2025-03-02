package day02.level01.commonpracticeproblem.person;

public class PersonDetails {
    private String name;
    private String address;
    private String phone;

    // Default constructor
    public PersonDetails() {
        this.name = "Bipin";
        this.address = "Kathmandu";
        this.phone = "9843545678";
    }

    // Parameterized constructor
    public PersonDetails(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // Copy constructor
    public PersonDetails(PersonDetails p) {
        this.name = p.name;
        this.address = p.address;
        this.phone = p.phone;
    }
    // Getter and Setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    // Display details
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
        System.out.println("-----------------------");

    }

}
