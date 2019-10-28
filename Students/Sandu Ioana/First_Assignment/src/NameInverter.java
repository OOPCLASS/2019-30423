
public class NameInverter {
	public static void main(final String[] args) {
		reverse(null);
		reverse("");
		reverse("SingleWord");
		reverse("FirstName LastName");
		reverse("  SingleWord  ");
		reverse("  FirstName  LastName  ");
		reverse("Mr. FirsName LastName");
		reverse("Mr. Phd. FirstName LastName");
		System.out.println("Finished"); 
	}
	public static String reverse(final String name) {
		if(name != null && !name.isEmpty()) {
			String nameFinal = name.trim().replaceAll(" +", " ");
			String[] words = nameFinal.split("\\s+");
			if(words.length == 1) {
				System.out.println(words[0]);
				return words[0];
			}
			if(words.length == 2) {
				System.out.println(words[1] + " " + words[0]);
				String finalName = words[1];
				finalName += " " + words[0];
				return finalName;
			}
			if(words.length > 2) {
				int n = words.length;
				String finalName = words[n-1];
				finalName += " " + words[n-2];
				for(int i = 0 ; i < n-2 ; i++) 
					finalName += " " + words[i];
				System.out.println(finalName);
				return finalName;
			}
		}
		else {
			if(name == null) {
				System.out.println("Null String");
				return null;
			}
			else {
				System.out.println("Empty String");
				return "";
			}
		}
		return "Fail";
	}
}
