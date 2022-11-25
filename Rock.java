public class Rock {
    int sampleNumber;
    String description;
    double weight;
    String typeOf;

    public Rock(int samples, double weight) {
        sampleNumber = samples;
        this.weight = weight;
        description = "Unclassified";
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public String getTypeOf() {
        return typeOf;
    }

    protected void setDescription(String d) {
        description = d;
    }
}
