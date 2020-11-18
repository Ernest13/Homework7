package markup;

import java.util.List;

public class Strikeout extends AbstractClass {

    public Strikeout(List<Content> list) {
        super(list);
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder);
    }

    @Override
    public String getMarkdownBorder() {
        return "~";
    }
    
    @Override
    public String getBBCopen() {
        return "[s]";
    }
    
    @Override
    public String getBBCclose() {
        return "[/s]";
    }
}