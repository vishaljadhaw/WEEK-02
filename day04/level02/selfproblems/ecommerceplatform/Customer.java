package day04.level02.selfproblems.ecommerceplatform;

public class Customer {
    private String name;
    private String email;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // toString method
    public String toString() {
        return name + " (" + email + ")";
    }

}
