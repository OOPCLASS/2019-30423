import java.util.Scanner;

public class NameInverter {

	public static String Title(String name) {

		int positionOfLastStop;
		positionOfLastStop = name.lastIndexOf(".");

		if (positionOfLastStop > 0) {
			String title = new String();
			String newTitle = new String();

			title = name.substring(0, positionOfLastStop + 1);
			title = title.trim();

			int positionOfLastSpace;
			positionOfLastSpace = title.lastIndexOf(" ");

			while (positionOfLastSpace >= 0) {
				String auxString = new String();

				auxString = title.substring(positionOfLastSpace + 1);
				auxString = auxString.concat(" ");
				newTitle = auxString.concat(newTitle);
				title = title.substring(0, positionOfLastSpace);
				title = title.trim();

				positionOfLastSpace = title.lastIndexOf(" ");
			}

			newTitle = " ".concat(newTitle);
			newTitle = title.concat(newTitle);
			newTitle = " ".concat(newTitle);
			return newTitle;
		} else
			return "";
	}

	public static String InvertTheName(String name) {

		String lastName = new String();
		String firstName = new String();

		int positionOfLastStop;
		positionOfLastStop = name.lastIndexOf(".");

		if (positionOfLastStop > 0)
			name = name.substring(positionOfLastStop + 1);

		name = name.trim();

		int positionOfLastSpace;
		positionOfLastSpace = name.lastIndexOf(" ");

		if (positionOfLastSpace < 0)
			return name;
		else {
			lastName = name.substring(positionOfLastSpace + 1);
			lastName = lastName.concat(", ");

			name = name.substring(0, positionOfLastSpace);
			name = name.trim();

			positionOfLastSpace = name.lastIndexOf(" ");

			while (positionOfLastSpace >= 0) {
				String auxString = new String();

				auxString = name.substring(positionOfLastSpace + 1);
				auxString = " ".concat(auxString);
				firstName = auxString.concat(firstName);

				name = name.substring(0, positionOfLastSpace);
				name = name.trim();

				positionOfLastSpace = name.lastIndexOf(" ");
			}
			firstName = name.concat(firstName);
		}

		String inversedName = new String();
		inversedName = lastName.concat(firstName);

		return inversedName;

	}

	public static String createInvertedString(String inputData) {

		if ((inputData == "") || (inputData == null))
			return inputData;
		else {
			String title = new String();
			title = Title(inputData);

			String finalString = new String();
			finalString = InvertTheName(inputData);
			finalString = finalString.concat(title);
			finalString = finalString.trim();

			return finalString;
		}
	}

	public static void main(String[] args) {

		String inputData = new String();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		inputData = scanner.nextLine();

		String finalString = new String();
		finalString = createInvertedString(inputData);

		System.out.println(finalString);

	}
}
