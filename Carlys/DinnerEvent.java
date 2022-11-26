public class DinnerEvent extends Event{
    int ent = 1;
    int side1 = 2;
    int side2 = 3;
    int des = 4;

    public static final String ENTREES[] = {"Steak", "Burger", "Pasta"};
    public static final String SIDES[]= {"Fries", "Potatoes", "Green Beans"};
    public static final String DESSERTS[] = {"Cupcake", "Cheesecake", "Ice Cream"};


    public DinnerEvent(String eventNum, int guestAmount, int ent, int side1, int side2, int des) {
        super(eventNum, guestAmount);
        this.ent = ent;
        this.side1 = side1;
        this.side2 = side2;
        this.des = des;
    }

    public int getEnt() {
        return this.ent;
    }

    public void setEnt(int ent) {
        this.ent = ent;
    }

    public int getSide1() {
        return this.side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return this.side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getDes() {
        return this.des;
    }

    public void setDes(int des) {
        this.des = des;
    }

    public String getMenu() {
        String name = "\n--Your Meal Selection--" + "\nEntree: " + ENTREES[ent] + "\nSide Dish One: " + SIDES[side1] + "\nSide Dish Two: " + SIDES[side2] + "\nDessert: " + DESSERTS[des];
        return name;
    }
}
