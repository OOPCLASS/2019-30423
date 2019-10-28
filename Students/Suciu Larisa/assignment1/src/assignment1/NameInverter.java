package assignment1;

public class NameInverter {

	public static void main(String[] args) {

		String finalName = new String();

		finalName = NameInverter.swapNames("Mr. Phd. Gerald Butler");
		System.out.println(finalName);
		finalName = NameInverter.swapNames("   Mrs. Ana Moldovan   ");
		System.out.println(finalName);
		finalName = NameInverter.swapNames("");
		System.out.println(finalName);
		finalName = NameInverter.swapNames("David");
		System.out.println(finalName);
		finalName = NameInverter.swapNames("  Mara  ");
		System.out.println(finalName);
		finalName = NameInverter.swapNames("Suciu Monica");
		System.out.println(finalName);


	}

	public static String getTitle(String name) {

		String title = new String();

		int mark = name.lastIndexOf(".");

		title = name.substring(0, mark + 1);
		return title;

	}

	public static String swapNames(String name) {

		if ((name.length() == 0) || (name == null))
			return name;

		else {

			name = name.trim();

			if (name.indexOf(" ") == -1)
				return (name);

			else {

				String title = getTitle(name);

				int lastSpace = name.lastIndexOf(" ");
				int length = title.length();

				String newName = new String();

				newName = name.substring(lastSpace + 1) + ", " + name.substring(length, lastSpace) + " " + title;

				return newName;

			}

		}
	}

}