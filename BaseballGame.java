public class BaseballGame
{
    private String[] names = new String[2];
    protected int[][] scores;
    public static final int UNPLAYED = 0;
    private final int INNINGS = 9;

    public BaseballGame()
    {
       scores = new int[2][INNINGS];
       for (int t = 0; t < scores.length; ++t) {
           for (int i = 0; i < scores[t].length; ++i) {
               scores[t][i] = UNPLAYED;
           }
       }
    }

    public int getInnings() {
        return INNINGS;
    }
    public int getScore(int team, int inning) {
        int score = 0;
        if (team < 0 || team > scores.length - 1) {
            System.out.println(team + " is an invalid team number");
        } else if (inning < 0 || inning > scores[0].length - 1) {
            System.out.println(inning + " is an invalid inning number");
        } else {
            score = scores[team][inning];
        }
        return score;
    }
    public void setNames(String n1, String n2) {
        names[0] = n1;
        names[1] = n2;
    }
    public void setScore(int team, int inning, int score) {
        int i;
        boolean inningsLeft = false;
        if (team < 0 || team > scores.length - 1) {
           System.out.println(team + " is not a valid team value");
       } else if (inning < 0 || inning > scores[0].length - 1) {
           System.out.println(inning + " is not a valid inning value");
       } else {
           for (i = 0; i < inning; i++) {
               if (scores[team][i] == UNPLAYED) {
                   inningsLeft = true;
               }
           }
           if (inningsLeft) {
               System.out.println("No score set for inning #" + inning);
           } else {
               scores[team][inning] = score;
           }
        }
    }
    public String getNames() {
        return names[0] + " vs " + names[1];
    }

    public String getName(int pos) {
        return names[pos];
    }
}