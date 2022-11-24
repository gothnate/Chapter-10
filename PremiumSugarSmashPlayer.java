public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
    private int LEVELS = 50;

    public PremiumSugarSmashPlayer() {
        scores = new int[LEVELS];
    }

    @Override
    public int getLevels() {
        return LEVELS;
    }
}
