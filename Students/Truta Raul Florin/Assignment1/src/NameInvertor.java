
public class NameInvertor {

	public static String Invert(String receivedName) {
		String[] Names = new String[100];
		String invertedName = new String();
		int l = 0;
		int Index = 0, i, prevIndex = 0, foundFirst = 0;
		// String receivedName = new String(" Mr. Phd. Truta Minecraft" );
		String name = receivedName.trim(); // Get rid of the white spaces in the front and end of the string
		int len = name.length();
		Index = len - 1;
		// As there might be some titles before the first name, we do a while to get all
		// the words
		i = Index;
		if (name.compareTo("") == 0) {
			Index = 0;
			Names[l] = "";
			l++;
			// System.out.print("");
		}
		while (Index != 0) {
			for (i = Index; i >= 0; i--) {
				if (name.charAt(i) == ' ' || i == -1) {
					prevIndex = Index;
					Index = i;
					String singleName = name.substring(Index + 1, prevIndex + 1); // a name or title
					if (foundFirst == 0) {
						// System.out.print(singleName + ", ");
						Names[l] = singleName + ", ";
						l++;
					} else {
						// System.out.print(singleName + " ");
						Names[l] = singleName;
						l++;
					}

					foundFirst++; // we found the last name and we don't put a comma anymore
				}
				if (i == 0) {
					// System.out.print(name.substring(0, Index + 1)); // print the first name or
					// first title
					String fst = name.substring(0, Index + 1);
					Names[l] = fst;
					l++;
					Index = 0;
				}
			}
		}

		if (Names[0] == null)
			invertedName = null;
		else
			for (i = 0; i < l; i++)
				invertedName = invertedName.concat(Names[i]);

		invertedName = invertedName.trim();
		return invertedName;
	}

	public static void main(String args[]) {
		String receivedName = new String("    Mr. Phd. Raul Minecraft");
		String Name = new String();
		Name = Invert(receivedName);
		System.out.print(Name);
		// if(Names[0] == "")
		// System.out.print("");
		// else for(int i = 0; i < 100 && Names[i] != null; i++)
		// System.out.print(Names[i]);
	}
}
