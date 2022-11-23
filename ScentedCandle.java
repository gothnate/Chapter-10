public class ScentedCandle {
    String color, scent;
    int height;
    double price = 3;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScent() {
        return this.scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
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