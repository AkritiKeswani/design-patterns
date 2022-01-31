
public class SystemWrapper {

	private static SystemWrapper single_instance = null;

	private SystemWrapper() {
	}

	public void println(String s) {
		System.out.println(s);
	}

	public static SystemWrapper getInstance() {
		if (single_instance == null)
			single_instance = new SystemWrapper();
		return single_instance;
	}
}
