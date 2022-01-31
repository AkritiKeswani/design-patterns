import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class MasterControl {
	public void start(ScannerWrapper scannerWrapper, SystemWrapper systemWrapper) {
		systemWrapper.println("Please enter FILE to input from file or CONSOLE to input from console:");
		String inputType = scannerWrapper.nextLine();
		systemWrapper.println("Please enter FILE to output from file or CONSOLE to output from console:");
		String outputType = scannerWrapper.nextLine();

		OutputFactory outputFactory = new OutputFactory(systemWrapper);
		InputFactory inputFactory = new InputFactory(scannerWrapper, systemWrapper);

		Input input = inputFactory.create(inputType);
		Output output = outputFactory.create(outputType);

		List<String> lines;

		try {
			lines = input.read();
		} catch (FileNotFoundException e) {
			systemWrapper.println("File Not Found Exception.");
			return;
		}

		CircularShifter circularShifter = new CircularShifter();
		lines = circularShifter.shiftLines(lines);
		Alphabetizer alphabetizer = new Alphabetizer();
		lines = alphabetizer.sort(lines);

		try {
			output.write(lines);
		} catch (IOException e) {
			systemWrapper.println("IOException Exception.");
			return;
		}
	}

	public static void main(String[] args) throws IOException {
		MasterControl mC = new MasterControl();
		mC.start(ScannerWrapper.getInstance(), SystemWrapper.getInstance());
	}
}
