public class Haiku extends Poem {
    String title;
    int lines;

    public Haiku(String title) {
        super(title, 3);
        this.title = title;
        this.lines = 3;
    }
}