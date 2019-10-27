
public class NameInverter {

	public static void main(String[] args) {

		String test = invert("  mr. phd. first last    ");
	//	test = invert("ms. mrs. phd. master. JOHN DOE");
		test = "   single  "; 
		//System.out.println(invert(null));
		System.out.println(invert(test));
		
	}

	public static String invert(String fullName) {

		final int ONE_NAME_PRESENT = 1;
		final int BOTH_NAMES_PRESENT = 2;
		int numberOfWords = 0;
		int numberOfTitles = 0;
		
		String firstName = new String();
		String lastName = new String();
		String title = new String();
		String fullTitle = new String();

		

		if (fullName == null)
			return null;

		if (fullName == "")
			return "";

		fullName = fullName.trim();
		String namesArray[] = fullName.split(" ");
		
		for (String name : namesArray) {
			numberOfWords++;
			if (name.contains(".")) {
				title = title.concat(name + " ");
				numberOfTitles++;
			}

		}

		if (numberOfWords == ONE_NAME_PRESENT)
			return (fullName);

		// just in case the person has more titles
		if ((numberOfWords - numberOfTitles) == BOTH_NAMES_PRESENT) {
			firstName = namesArray[numberOfWords - 2];
			lastName = namesArray[numberOfWords - 1];
		}

		fullTitle = fullTitle.concat(lastName + " , " + firstName + " " + title);

		return fullTitle;

	}

}
