package markup;

import java.util.List;

public class Paragraph {

	List<Content> list;

    public Paragraph(List<Content> list) {
        this.list = list;
    }

    public void toMarkdown(StringBuilder sb) {
        for (Content element : list) {
            element.toMarkdown(sb);
        }
    }
    
    public void toBBCode(StringBuilder sb) {
    	for (Content element : list) {
            element.toBBCode(sb);
        }
    }
	
}
