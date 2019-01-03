import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExAssignment {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please Input Your String:");
		String userInput = s.nextLine();
		// Find longest substring
		System.out.println("Find longest Substring that ends with 1101");
		String q1 = ".+(1101)";
		findByRegEx(userInput, q1);

		// All substrings that end with 1101
		System.out.println("All Substrings that end with 1101");
		String q2 = ".*?(1101)";
		findByRegEx(userInput, q2);

		// All substrings that have at most one character before the 1101
		System.out.println("All Substrings that have at most one character before 1101");
		String q3 = "\\s*(1101|.1101)";
		findByRegEx(userInput, q3);
	}

	public static void findByRegEx(String s, String q) {
		Pattern pattern = Pattern.compile(q);
		Matcher matcher = pattern.matcher(s);

		boolean found = false;
		while (matcher.find()) {
			System.out.printf("Found the text" + " \"%s\" starting at " + "index %d and ending at index %d.%n",
					matcher.group(), matcher.start(), matcher.end());
			found = true;
		}
		if (!found) {
			System.out.printf("No match found.%n");
		}
	}
}
