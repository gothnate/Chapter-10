public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String address;

    public DeliveryPizza(String description, double price, String address) {
        super(description, price);
        this.address = address;
        if (price > 15.00) {
            deliveryFee = 3.00;
        } else {
            deliveryFee = 5.00;
        }
    }

    public void display() {
        super.display();
        System.out.println("\nDeliver to: " + address + ". Fee is " + deliveryFee);
    }
}
