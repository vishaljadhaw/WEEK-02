package day04.level02.assistedproblems.composition;

public class Main {public static void main(String[] args) {
    Company company = new Company("Capgemini");

    // Add departments
    company.addDepartment("IT");
    company.addDepartment("HR");

    // Add employees to departments
    Department itDepartment = company.getDepartments().get(0);
    itDepartment.addEmployee("BK Sahu", "E001");
    itDepartment.addEmployee("DK Jaat", "E002");

    Department hrDepartment = company.getDepartments().get(1);
    hrDepartment.addEmployee("Chandra", "E003");

    // Display company details
    company.displayCompanyDetails();

    // Delete company
    company.deleteCompany();
}

}
