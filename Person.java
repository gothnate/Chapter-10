import java.util.Scanner;
public class Person {
    Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;

    public void setData() {
        System.out.print("First Name: ");
        this.firstName = input.nextLine();
        System.out.print("Last Name: ");
        this.lastName = input.nextLine();
        System.out.print("Address: ");
        this.address = input.nextLine();
        System.out.print("ZIP Code: ");
        this.zip = input.nextLine();
        System.out.print("Phone: ");
        this.phone = input.nextLine();
    }

    public void display() {
        System.out.print(firstName + " " + lastName);
        System.out.print(" " + address);
        System.out.print(" " + zip);
        System.out.print(" " + phone);
    }
}