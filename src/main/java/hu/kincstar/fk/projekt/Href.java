package hu.kincstar.fk.projekt;

public class Href implements TextSource{
    private String href;
    private String text;

    public Href(String href, String text) {
        this.href = href;
        this.text = text;
    }
    @Override
    public String getPlainText() {
        return "<a href=\"" + href + "\">" + text +"</a>";
    }
}
