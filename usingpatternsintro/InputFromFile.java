import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFromFile implements Input {
	@Override
	public List<String> read() throws FileNotFoundException {
		List<String> inputRead = new ArrayList<String>();
		File file = new File("kwic.txt");
		Scanner reader = new Scanner(file);
		while (reader.hasNextLine()) {
			inputRead.add(reader.nextLine());
		}
		reader.close();
		return inputRead;
	}
}
