public class EmployeeCompanyInfo {
    private String empName;
    private double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public EmployeeCompanyInfo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeCompanyInfo emp1 = new EmployeeCompanyInfo("Alice", 50000);
        EmployeeCompanyInfo emp2 = new EmployeeCompanyInfo("Bob", 60000);
        EmployeeCompanyInfo emp3 = new EmployeeCompanyInfo("Charlie", 70000);

        EmployeeCompanyInfo.printCompanyInfo();
    }
}
