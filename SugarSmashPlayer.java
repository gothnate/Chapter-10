public class SugarSmashPlayer {
    int idNumber;
    String name;
    protected int[] scores;
    private final int MINSCORE = 100;
    private int LEVELS = 10;

    public SugarSmashPlayer() {
        scores = new int[LEVELS];
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore(int level) {
        int score = 0;
        if (level < 0 || level > scores.length - 1) {
            System.out.println(level + " is an invalid level number");
        } else {
            score = scores[level];
        }
        return score;
    }

    public void setScore(int score, int level) {
        int i;
        boolean isBadLevel = false;
        if (level < 0 || level > scores.length - 1) {
            System.out.println(level + " is an invalid level number");
        } else {
            for (i = 0; i < level; i++) {
                if (scores[i] < MINSCORE) {
                    isBadLevel = true;
                }
            }
            if (isBadLevel) {
                System.out.println("A score cannot yet be set for level " + level);
            } else {
                scores[level] = score;
            }
        }
    }

    public int getLevels() {
        return LEVELS;
    }
}