package markup;

import java.util.List;

public class Strong extends AbstractClass {

    public Strong(List<Content> list) {
        super(list);
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        super.toMarkdown(stringBuilder);
    }

    @Override
    public String getMarkdownBorder() {
        return "__";
    }
    
    @Override
    public String getBBCopen() {
        return "[b]";
    }
    
    @Override
    public String getBBCclose() {
        return "[/b]";
    }
    
}