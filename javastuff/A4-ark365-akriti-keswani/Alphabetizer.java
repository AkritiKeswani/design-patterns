import java.util.List;

public class Alphabetizer {
	private List<String> insertionSort(List<String> lines) {
		for (int i = 1; i < lines.size(); i++) {
			String key = lines.get(i);
			int j = i - 1;
			while (j >= 0 && key.compareToIgnoreCase(lines.get(j)) < 0) {
				lines.set(j + 1, lines.get(j));
				j = j - 1;
			}
			lines.set(j + 1, key);
		}
		return lines;
	}

	public List<String> sort(List<String> lines) {
		return insertionSort(lines);
	}
}
