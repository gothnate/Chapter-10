public class Poem {
    String title;
    int lines;

    public Poem(String title, int lines) {
        this.title = title;
        this.lines = lines;
    }

    public String getTitle() {
        return this.title;
    }

    public int getLines() {
        return this.lines;
    }
}