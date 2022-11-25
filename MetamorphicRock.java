public class MetamorphicRock extends Rock {

    public MetamorphicRock(int samples, double weight) {
        super(samples, weight);
        setDescription(description);
    }

    protected void setDescription(String string) {
        description = "Metamorphic rocks arise from the transformation of existing rock to new types of rock\nin a process called metamorphism. The original rock is subjected to temperatures\ngreater than 150 to 200 °C and, often, elevated pressure of 100 megapascals or more, causing profound \nphysical or chemical changes";
    }
}