public class IgneousRock extends Rock{

    public IgneousRock(int samples, double weight) {
        super(samples, weight);
        setDescription(description);
    }

    protected void setDescription(String string) {
        description = "Igneous rock, or magmatic rock, is one of the three main rock types, the others being \nsedimentary and metamorphic.\nIgneous rock is formed through the cooling and solidification of magma or lava.\nThe magma can be derived from partial melts of existing rocks in either a planet's mantle or crust.";
    }
}