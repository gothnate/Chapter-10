public class Faculty extends CollegeEmployee {
    private boolean isTenured = false;

    public Faculty() {
    }

    @Override
    public void setData() {
        super.setData();
        char temp;
        super.setData();
        System.out.print("Tenured (Y)es or (N)o? ");
        temp = input.nextLine().toUpperCase().charAt(0);
        if (temp == 'Y') {
            isTenured = true;
        }
    }

    @Override
    public void display() {
        super.display();
        if (isTenured) {
            System.out.println("Faculty Member is Tenured");
        } else {
            System.out.println("Faculty Member is Not Tenured");
        }
    }
}