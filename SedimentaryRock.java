public class SedimentaryRock extends Rock {

    public SedimentaryRock(int samples, double weight) {
        super(samples, weight);
        setDescription(description);
    }

    protected void setDescription(String string) {
        description = "Sedimentary rocks are types of rock that are formed by the accumulation or\ndeposition of mineral or organic particles at Earth's surface, followed by cementation.\nSedimentation is the collective name for processes that cause these particles to settle in place.";
    }
}