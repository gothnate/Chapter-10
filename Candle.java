public class Candle {
    String color;
    int height;
    double price = 2;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPrice() {
        return price * height;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}