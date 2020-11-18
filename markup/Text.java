package markup;

public class Text implements Content {
	String text;
	
	public Text(String text) {
		this.text = text;
	}
	
	@Override
	public void toMarkdown(StringBuilder sb) {
		sb.append(text);
	}
	
	@Override
	public void toBBCode(StringBuilder sb) {
		sb.append(text);
	}

	public String getText() {
		return text;
	}
}
