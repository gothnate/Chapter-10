public class Student extends Person {
    private String major;
    private double gpa;

    public Student() {
    }

    @Override
    public void setData() {
        super.setData();
        System.out.print("Enter Student Major: ");
        this.major = input.nextLine();
        System.out.print("Enter Student GPA: ");
        this.gpa = input.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}