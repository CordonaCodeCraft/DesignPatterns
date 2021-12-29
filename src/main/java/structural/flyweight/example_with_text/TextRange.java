package structural.flyweight.example_with_text;

public class TextRange {
	public int start;
	public int end;
	public boolean capitalize;
	public boolean bold;
	public boolean italic;

	public TextRange(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public boolean covers(int position) {
		return position >= start && position <= end;
	}
}

