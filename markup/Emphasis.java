package markup;

import java.util.List;

public class Emphasis extends AbstractClass {

    public Emphasis(List<Content> list) {
        super(list);
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder);
    }

    @Override
    public String getMarkdownBorder() {
        return "*";
    }
    
    @Override
    public String getBBCopen() {
        return "[i]";
    }
    
    @Override
    public String getBBCclose() {
        return "[/i]";
    }
}