public class Pizza {
    String description;
    double price;

    public Pizza(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public void display() {
        System.out.print(description + " pizza Price: $" + price);
    }
}