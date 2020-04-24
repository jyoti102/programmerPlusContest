
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The ProgrammerPlusContest class
 * 
 * @author JyotiSingh
 *
 */
public class ProgrammerPlusContest {

	/*
	 * QUESTION: Write a function that operates as stated below:
	 * 
	 * In: Get 
	 * Out: 2069
	 * 
	 * In: More 
	 * Out: 5191716
	 * 
	 * In: Insight 
	 * Out: 209912231915
	 */
	public static void main(String[] args) throws IOException {
		System.out.print("In: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();
		System.out.println("Out: " + programPlusCodingContest(input));
	}

	/**
	 * @param input
	 * @return
	 */
	private static String programPlusCodingContest(String input) {
		if ((input != null) && !input.equals("") && (input.chars().allMatch(Character::isLetter))
				&& (input.length() <= 100)) {
			AtomicInteger index = new AtomicInteger();
			input = new StringBuffer(input.toLowerCase(Locale.US)).reverse().toString();
			StringBuilder output = new StringBuilder();

			input.chars().forEach(i -> output.append(i - 96 + index.getAndIncrement()));
			return output.toString();
		} else {
			return "Please enter only letters with max length 100. Eg: GET, more, InSiGHT..";
		}
	}
}
