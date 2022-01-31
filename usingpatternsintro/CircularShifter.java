import java.util.ArrayList;
import java.util.List;

public class CircularShifter {
	 public String doOneCircularShift(String line) {
		 String arr[] = line.split(" ", 2);
		 String shiftedString = new String(arr[1] + " " + arr[0]);
		 return shiftedString;
	 }
	 public List<String> shiftLinesForOneString(String line) {
		List<String> toReturn = new ArrayList<String>();
		String shiftedString = doOneCircularShift(line);
		while (!shiftedString.equals(line)) {
			toReturn.add(shiftedString);
			shiftedString = doOneCircularShift(shiftedString);
		}
		toReturn.add(line);
		return toReturn;
	 }
	 
	 public List<String> shiftLines(List<String> lines) {
		List<String> toReturn = new ArrayList<String>();
		for (String line : lines) {
			toReturn.addAll(shiftLinesForOneString(line));
		}
		return toReturn;		 
	 }
}
