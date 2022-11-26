public class CollegeEmployee extends Person {
    private String ssn, dept;
    private double annualSalary;

    public CollegeEmployee() {
    }

    @Override
    public void setData() {
        super.setData();
        System.out.print("Enter Social Security Number: ");
        this.ssn = input.nextLine();
        System.out.print("Enter Annual Salary: ");
        this.annualSalary = input.nextDouble();
        System.out.print("Enter Employee Department: ");
        input.nextLine();
        this.dept = input.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.print("\nSSN: " + ssn);
        System.out.print(" Salary: $" + annualSalary);
        System.out.print(" Department: " + dept + "\n");
    }
}