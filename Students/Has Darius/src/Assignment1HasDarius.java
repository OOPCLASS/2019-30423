
public class Assignment1HasDarius {
	public static void main(String[] args) {
		returnName("");
		returnName(null);
		returnName("   Darius   ");
		returnName("Darius");
		returnName("   Darius  Has   ");
		returnName("Darius Has");
		returnName("Mr. Darius Has");
		returnName("Mrs. Raluca Has");
		returnName("Mr. Phd. Conf. Darius Robert Cristian Has");

	}

	public static String returnName(String name) {
		String[] copy;
		if (name == null)
			return null;
		if (name == "")
			return "";
		name = name.trim();
		name = name.replaceAll("( )+", " ");
		boolean hasSpaces = name.contains(" ");
		if (hasSpaces == false) {
			System.out.println(name);
			return name;
		} else
			copy = name.split(" ");
		int length = copy.length;
		System.out.println(length);
		name = copy[length - 1] + ", ";
		int i = length - 2;
		while (i >= 0 && !copy[i].contains(".")) {
			i--;
		}
		for (int j = i + 1; j <= length - 2; j++)
			name = name + copy[j] + " ";

		for (int j = 0; j < i; j++)
			name = name + copy[j] + " ";
		if (i > -1)
			name = name + copy[i];
		System.out.println(name);
		return name;
	}
}
