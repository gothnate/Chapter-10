public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    public void setOrderNumber(int orderNumber)
    {
        // write your code here
        this.orderNumber = orderNumber;
    }

    public void setSize(String size)
    {
        // write your code here
        this.size = size.toUpperCase();

        if (size.equals("XXL") || size.equals("XXXL")) {
            this.price = 22.99;
        } else {
            this.price = 19.99;
        }
    }

    public void setColor(String color)
    {
        // write your code here
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderNumber()
    {
        return orderNumber;
        // write your code here
    }
    public String getSize()
    {
        return size;
        // write your code here
    }
    public String getColor()
    {
        return color;
        // write your code here
    }
    public double getPrice()
    {
        return price;
        // write your code here
    }
}