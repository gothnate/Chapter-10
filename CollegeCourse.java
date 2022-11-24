public class CollegeCourse {
    protected String dept;
    protected int id;
    protected double credits;
    protected double price;

    public CollegeCourse(String dept, int id, double credits) {
        this.dept = dept;
        this.id = id;
        this.credits = credits;

        price = credits * 120;
    }

    public void display() {
        System.out.println(dept + id);
        System.out.println("Non-Lab Course");
        System.out.println(credits + " credits");
        System.out.println("Total fee is $" + price);
    }
}