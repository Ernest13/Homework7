package markup;

import java.util.List;

public abstract class AbstractClass implements Content {
	private List<Content> markUpElements;
    protected AbstractClass(List<Content> list) {
        this.markUpElements = list;
    }

    @Override
    public void toMarkdown(StringBuilder stringBuilder) {
        stringBuilder.append(getMarkdownBorder());
        for (Content entry : markUpElements) {
            entry.toMarkdown(stringBuilder);
        }
        stringBuilder.append(getMarkdownBorder());
    }
    
    @Override
    public void toBBCode(StringBuilder stringBuilder) {
        stringBuilder.append(getBBCopen());
        for (Content entry : markUpElements) {
            entry.toBBCode(stringBuilder);
        }
        stringBuilder.append(getBBCclose());
    }

    public abstract String getMarkdownBorder();
    public abstract String getBBCopen();
    public abstract String getBBCclose();
}
