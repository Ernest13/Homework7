package markup;

public interface Content {
	void toMarkdown(StringBuilder sb);
	void toBBCode(StringBuilder sb);
}
