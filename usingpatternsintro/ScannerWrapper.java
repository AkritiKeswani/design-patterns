import java.util.Scanner;

public class ScannerWrapper {

	private static ScannerWrapper single_instance = null;

	private Scanner scanner;

	private ScannerWrapper() {
		scanner = new Scanner(System.in);
	}

	public String nextLine() {
		return scanner.nextLine();
	}

	public static ScannerWrapper getInstance() {
		if (single_instance == null)
			single_instance = new ScannerWrapper();
		return single_instance;
	}
}
