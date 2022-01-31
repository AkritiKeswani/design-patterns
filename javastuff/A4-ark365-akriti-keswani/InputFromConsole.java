import java.util.ArrayList;
import java.util.List;

public class InputFromConsole implements Input {
	ScannerWrapper scannerWrapper;
	SystemWrapper systemWrapper;

	public InputFromConsole(ScannerWrapper scannerWrapper, SystemWrapper systemWrapper) {
		this.scannerWrapper = scannerWrapper;
		this.systemWrapper = systemWrapper;
	}

	@Override
	public List<String> read() {
		List<String> inputRead = new ArrayList<String>();
		systemWrapper.println("Please enter lines to add, then enter -1 to finish:");
		String lineRead = scannerWrapper.nextLine();
		while (!lineRead.contentEquals("-1")) {
			inputRead.add(lineRead);
			lineRead = scannerWrapper.nextLine();
		}
		return inputRead;
	}
}
